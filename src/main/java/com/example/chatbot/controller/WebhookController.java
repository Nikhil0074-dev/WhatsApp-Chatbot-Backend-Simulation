package com.example.chatbot.controller;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.service.ChatService;
import com.example.chatbot.util.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {
        String userMessage = request.getMessage();
        LoggerUtil.log("Received: " + userMessage);
        String reply = chatService.getReply(userMessage);
        LoggerUtil.log("Reply sent: " + reply);
        return reply;
    }
}
