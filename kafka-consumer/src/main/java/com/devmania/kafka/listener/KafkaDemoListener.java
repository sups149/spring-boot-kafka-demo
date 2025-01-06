package com.devmania.kafka.listener;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaDemoListener {
    Counter messageCount;

    public KafkaDemoListener(MeterRegistry meterRegistry) {
        messageCount = Counter.builder("message_received_count")
                .description("Number of message received")
                .register(meterRegistry);
    }

    @KafkaListener(topics = "test-events-topic")
    public void processMessage(String content) {
        messageCount.increment();
        System.out.println(content);
    }

}
