package com.adriendr.dota2.dota2privatelearning.clarity.metier;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String id;

    private List<ChatMessage> chatMessages;

    public Game() {
        chatMessages = new ArrayList<ChatMessage>();
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

    public void addMessage(ChatMessage chatMessage){
        getChatMessages().add(chatMessage);
    }
}
