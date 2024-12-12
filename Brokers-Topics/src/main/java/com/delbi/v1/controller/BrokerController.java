package com.delbi.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delbi.v1.service.KafkaProducerService;

@RestController
public class BrokerController {

    private final KafkaProducerService kafkaProducerService;

    public BrokerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/create-brokers")
    public String createBrokers() {
        // Send messages to topics
        kafkaProducerService.sendMessageToTopic("sri", "broker1");
        kafkaProducerService.sendMessageToTopic("ragav", "broker2");

        return "Brokers created: broker1 in 'sri', broker2 in 'ragav'.";
    }
}

