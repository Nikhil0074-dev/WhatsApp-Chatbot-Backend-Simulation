# WhatsApp Chatbot Backend Simulation (Spring Boot)

## 📌 Project Overview
This project simulates a WhatsApp chatbot backend using Spring Boot.

**Features:**
- Receives messages via `/webhook` API
- Processes input text
- Sends predefined replies
- Logs all messages with timestamps

## 🚀 Quick Start

1. **Prerequisites:**
   ```
   Java 17+
   Maven 3.6+
   ```

2. **Build & Run:**
   ```bash
   cd whatsapp-chatbot
   mvn clean install
   mvn spring-boot:run
   ```

3. **Test with Postman/curl:**
   ```bash
   curl -X POST http://localhost:8080/webhook \
   -H "Content-Type: application/json" \
   -d '{"message": "hi"}'
   ```

## 🧪 Test Cases

| Input | Expected Output |
|-------|-----------------|
| `{"message": "hi"}` | `Hello 👋 How can I help you?` |
| `{"message": "bye"}` | `Goodbye 👋 Have a great day!` |
| `{"message": "help"}` | `I can respond to: hi, hello, bye, goodbye, help` |

## 📸 Console Output Example
```
[2024-10-01 10:30:15] Received: hi
[2024-10-01 10:30:15] Reply sent: Hello 👋 How can I help you?
```

## 🎯 Architecture
```
Client (Postman) → POST /webhook → WebhookController → ChatService → Reply + Log
```

## 🛠️ Project Structure
```
whatsapp-chatbot/
├── pom.xml
├── src/main/java/com/example/chatbot/
│   ├── ChatbotApplication.java
│   ├── controller/WebhookController.java
│   ├── service/ChatService.java
│   ├── model/MessageRequest.java
│   └── util/LoggerUtil.java
└── src/main/resources/application.properties
```

## 🚀 Bonus: Deploy on Render
1. Push to GitHub
2. Create Web Service on Render
3. Build Command: `mvn clean install`
4. Start Command: `java -jar target/chatbot-0.0.1-SNAPSHOT.jar`

## ✨ Advanced Features (Future)
- Database storage (H2/PostgreSQL)
- AI integration (OpenAI)
- Session management
- Real WhatsApp Business API

## 🎓 Key Spring Boot Concepts
- `@RestController` - REST API endpoints
- `@RequestBody` - JSON deserialization  
- `@Autowired` - Dependency Injection
- `@Service` - Business logic layer

