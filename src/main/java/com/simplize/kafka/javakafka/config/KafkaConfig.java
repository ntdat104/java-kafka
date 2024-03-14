package com.simplize.kafka.javakafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Value("${application.queue.kafka.test-topic}")
    private String topic;

    @Bean
    NewTopic initTopic() {
        return new NewTopic(topic, 3, (short) 1);
    }

}
