package com.adriendr.dota2.dota2privatelearning.repository.allchat;

import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.ChatMessage;

import java.util.Iterator;
import java.util.List;

public interface ChatMessageService {

    ChatMessage save(ChatMessage chatMessage);

    void delete(ChatMessage chatMessage);

    ChatMessage findOne(String id);

    Iterable<ChatMessage> findAll();

    Iterator<ChatMessage> findByAuthor(String author);

    List<ChatMessage> findByMessage(String message);
}
