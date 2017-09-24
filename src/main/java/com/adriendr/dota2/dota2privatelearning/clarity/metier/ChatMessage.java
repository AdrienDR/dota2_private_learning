package com.adriendr.dota2.dota2privatelearning.clarity.metier;

public class ChatMessage {

    private String author;
    private String message;

    public ChatMessage() {
    }

    public ChatMessage(String author, String message) {
        this.author = author;
        this.message = message;
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
