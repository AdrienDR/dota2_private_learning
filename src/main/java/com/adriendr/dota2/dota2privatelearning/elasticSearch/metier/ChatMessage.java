package com.adriendr.dota2.dota2privatelearning.elasticSearch.metier;

public class ChatMessage {

    private String id;
    private String author;
    private String message;

    public ChatMessage() {
    }

    public ChatMessage(String id, String author, String message) {
        this.id = id;
        this.author = author;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
