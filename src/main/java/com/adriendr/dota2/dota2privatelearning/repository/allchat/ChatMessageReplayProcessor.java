package com.adriendr.dota2.dota2privatelearning.repository.allchat;

import skadistats.clarity.processor.reader.OnMessage;
import skadistats.clarity.processor.runner.Context;
import skadistats.clarity.wire.s2.proto.S2UserMessages;

public class ChatMessageReplayProcessor {

    @OnMessage(S2UserMessages.CUserMessageSayText2.class)
    public void onMessage(Context ctx, S2UserMessages.CUserMessageSayText2 message) {
        System.out.format("%s: %s\n", message.getParam1(), message.getParam2());
    }
}
