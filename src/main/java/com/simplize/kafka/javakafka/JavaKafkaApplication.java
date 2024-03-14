package com.simplize.kafka.javakafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JavaKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaKafkaApplication.class, args);
	}

}
