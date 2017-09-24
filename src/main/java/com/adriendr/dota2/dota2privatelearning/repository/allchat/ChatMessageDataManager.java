package com.adriendr.dota2.dota2privatelearning.repository.allchat;

import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.ChatMessage;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ChatMessageDataManager {

    private final Client client;

    @Autowired
    public ChatMessageDataManager(Client client) {
        this.client = client;
    }

    ChatMessage save(ChatMessage chatMessage){
        return null;
    }

    void delete(ChatMessage chatMessage){

    }

    ChatMessage findOne(String id){
        return null;
    }

    Iterable<ChatMessage> findAll(){
        return null;
    }

    Iterator<ChatMessage> findByAuthor(String author){
        return null;
    }

    List<ChatMessage> findByMessage(String message){
        return null;
    }

}
