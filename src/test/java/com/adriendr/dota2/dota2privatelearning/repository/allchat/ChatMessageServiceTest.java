package com.adriendr.dota2.dota2privatelearning.repository.allchat;

import com.adriendr.dota2.dota2privatelearning.Dota2PrivateLearningApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Dota2PrivateLearningApplication.class)
public class ChatMessageServiceTest {

    @Autowired
    private ChatMessageService chatMessageService;


    public void before(){
//        elasticsearchTemplate.deleteIndex(ChatMessage.class);
//        elasticsearchTemplate.createIndex(ChatMessage.class);
//        elasticsearchTemplate.putMapping(ChatMessage.class);
//        elasticsearchTemplate.refresh(ChatMessage.class);
    }

    @Test
    public void testSave(){
//        ChatMessage adrien = new ChatMessage("1001", "Adrien", "Wtf dude!");
//        chatMessageService.save(adrien);
//
//        ChatMessage one = chatMessageService.findOne("1001");
//        assertNotNull(one.getId());
//        assertEquals(adrien.getId(), one.getId());
//        assertEquals(adrien.getAuthor(), one.getAuthor());
//        assertEquals(adrien.getMessage(), one.getMessage());
    }
}
