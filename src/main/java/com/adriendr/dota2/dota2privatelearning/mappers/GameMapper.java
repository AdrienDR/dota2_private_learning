package com.adriendr.dota2.dota2privatelearning.mappers;

import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.ChatMessage;
import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.Game;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameMapper {

    Game clarityToElasticSearchGame(com.adriendr.dota2.dota2privatelearning.clarity.metier.Game game);

    ChatMessage clarityToElasticSearchChatMessage(com.adriendr.dota2.dota2privatelearning.clarity.metier.ChatMessage chatMessage);
}
