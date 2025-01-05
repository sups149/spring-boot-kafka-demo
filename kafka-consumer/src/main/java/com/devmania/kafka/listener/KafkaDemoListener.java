package com.devmania.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaDemoListener {
    @KafkaListener(topics = "test-events-topic")
    public void processMessage(String content) {
        System.out.println(content);
    }

}
