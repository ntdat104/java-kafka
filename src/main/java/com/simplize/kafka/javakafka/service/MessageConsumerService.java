package com.simplize.kafka.javakafka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    @Value("${application.queue.kafka.test-topic}")
    private String topic;
    
    @KafkaListener(topics = "${application.queue.kafka.test-topic}", groupId = "group-id")
    public void consume(String message) {
        System.out.println("Consumed recieve message: " + message);
    }

}
