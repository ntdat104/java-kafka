package com.simplize.kafka.javakafka.worker;

import java.text.MessageFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.simplize.kafka.javakafka.service.MessageProducerService;

@Component
public class KafkaWorker {

    private MessageProducerService messageProducerService;
    
    public KafkaWorker(MessageProducerService messageProducerService) {
        this.messageProducerService = messageProducerService;
    }

    @Scheduled(fixedRate = 2000)
    public void sendText() {
        messageProducerService.sendMessage(MessageFormat.format("timer: {0}", new Date().toString()));
    }

}
