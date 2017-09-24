package com.adriendr.dota2.dota2privatelearning.game;

import com.adriendr.dota2.dota2privatelearning.clarity.ClarityService;
import com.adriendr.dota2.dota2privatelearning.elasticSearch.GameDataManager;
import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.Game;
import com.adriendr.dota2.dota2privatelearning.mappers.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class GameServiceImpl implements GameService{

    private final GameDataManager gameDataManager;
    private final ClarityService clarityService;
    private final GameMapper gameMapper;

    @Autowired
    public GameServiceImpl(GameDataManager gameDataManager, ClarityService clarityService, GameMapper gameMapper) {
        this.gameDataManager = gameDataManager;
        this.clarityService = clarityService;
        this.gameMapper = gameMapper;
    }

    @Override
    public void loadAndSaveGame(String pathToReplay) throws IOException {
        Game game = gameMapper.clarityToElasticSearchGame(clarityService.processGame(new File(pathToReplay)));

        gameDataManager.save(game);
    }
}
