package com.adriendr.dota2.dota2privatelearning.clarity.processors;

import com.adriendr.dota2.dota2privatelearning.clarity.ClarityService;
import com.adriendr.dota2.dota2privatelearning.clarity.metier.ChatMessage;
import com.adriendr.dota2.dota2privatelearning.clarity.metier.Game;
import skadistats.clarity.processor.reader.OnMessage;
import skadistats.clarity.processor.runner.Context;
import skadistats.clarity.wire.s2.proto.S2UserMessages;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ChatProcessor extends Processor {

    private final Logger logger = LogManager.getLogManager().getLogger(ChatProcessor.class.getName());

    public ChatProcessor(Game game) {
        super(game);
    }

    @OnMessage(S2UserMessages.CUserMessageSayText2.class)
    public void onMessage(Context ctx, S2UserMessages.CUserMessageSayText2 message) {
        logger.finest(() -> String.format("New message => {}: {}\n", message.getParam1(), message.getParam2()));
        getGame().addMessage(new ChatMessage(message.getParam1(), message.getParam2()));
    }

}
