package com.adriendr.dota2.dota2privatelearning.repository.allchat;

import com.adriendr.dota2.dota2privatelearning.elasticSearch.metier.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ChatMessageServiceImpl implements ChatMessageService {

    private final ChatMessageDataManager chatMessageDataManager;

    public ChatMessageServiceImpl(ChatMessageDataManager chatMessageDataManager) {
        this.chatMessageDataManager = chatMessageDataManager;
    }

    @Override
    public ChatMessage save(ChatMessage chatMessage) {
        return chatMessageDataManager.save(chatMessage);
    }

    @Override
    public void delete(ChatMessage chatMessage) {
        chatMessageDataManager.delete(chatMessage);
    }

    @Override
    public ChatMessage findOne(String id) {
        return chatMessageDataManager.findOne(id);
    }

    @Override
    public Iterable<ChatMessage> findAll() {
        return chatMessageDataManager.findAll();
    }

    @Override
    public Iterator<ChatMessage> findByAuthor(String author) {
        return chatMessageDataManager.findByAuthor(author);
    }

    @Override
    public List<ChatMessage> findByMessage(String message) {
        return chatMessageDataManager.findByMessage(message);
    }
}
