package com.adriendr.dota2.dota2privatelearning.elasticSearch.metier;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName(value = "game")
public class Game {

    private String id;

    private List<ChatMessage> chatMessages;

    public Game() {
    }

    public Game(List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }


}
