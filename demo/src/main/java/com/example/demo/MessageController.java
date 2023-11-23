package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
//@RequestMapping("/api")

public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);


    @PostMapping("/logMyMessage")
    public void logMyMessage(@RequestBody Message message) {
        // Logique de gestion du message
        logger.info("Message reçu : {}", message.getMessage());

    }
}
