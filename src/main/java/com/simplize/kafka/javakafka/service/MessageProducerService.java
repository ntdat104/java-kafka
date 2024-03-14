package com.simplize.kafka.javakafka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageProducerService {
    
    @Value("${application.queue.kafka.test-topic}")
    private String topic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    public MessageProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info("topic {}", topic);
        kafkaTemplate.send(topic, message);
        System.out.println("Producer sent message: " + message);
    }

}
