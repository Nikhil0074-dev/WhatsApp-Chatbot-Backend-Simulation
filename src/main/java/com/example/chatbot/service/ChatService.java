package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {
        if (message == null || message.trim().isEmpty()) {
            return "Invalid message";
        }

        String lowerMessage = message.toLowerCase().trim();

        return switch (lowerMessage) {
            case "hi", "hello", "hey" -> "Hello  How can I help you?";
            case "bye", "goodbye", "exit" -> "Goodbye  Have a great day!";
            case "help" -> "I can respond to: hi, hello, bye, goodbye, help";
            case "time" -> "Current time is logged in console.";
            default -> "Sorry, I don't understand that  Try 'hi' or 'help'";
        };
    }
}
