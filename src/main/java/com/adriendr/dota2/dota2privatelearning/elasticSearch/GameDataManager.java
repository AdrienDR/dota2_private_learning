package com.adriendr.dota2.dota2privatelearning.elasticSearch;

import com.adriendr.dota2.dota2privatelearning.config.ElasticSearchTypes;
import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.Game;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Service
public class GameDataManager {

    private Logger logger = LogManager.getLogManager().getLogger(GameDataManager.class.getName());

    private final Client client;

    private final ObjectMapper objectMapper;

    @Value("${elasticsearch.gameindex}")
    private String gameIndex;

    @Autowired
    public GameDataManager(Client client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    public void save(Game game) throws JsonProcessingException {
        byte[] gameJsonBytes = objectMapper.writeValueAsBytes(game);
        IndexResponse indexResponse = client.prepareIndex(gameIndex, ElasticSearchTypes.GAME_TYPE.getTypeName(), game.getId())
                .setSource(gameJsonBytes, XContentType.JSON)
                .get();
        logger.info(() -> String.format("Résultat d'enregistrement de l'objet game -> index:{}, type:{}, id:{}, version:{}, créé:{}",
                indexResponse.getIndex(), indexResponse.getType(), indexResponse.getId(),
                indexResponse.getVersion(), indexResponse.isCreated()));
    }
}
