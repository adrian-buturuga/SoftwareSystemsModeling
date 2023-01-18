package com.example.kafka.micro1.service;

import com.example.kafka.micro1.model.User;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import static com.example.kafka.micro1.service.UserProducer.KAFKA_TOPIC;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HRConsumer implements Consumer {

    @KafkaListener(topics = KAFKA_TOPIC, groupId = "group_id")
    public void consume(@Payload User user,
                        @Headers MessageHeaders headers) {
        log.info("HR Team notified about new colleague = '{}'", user);
        headers.keySet().forEach(key -> {
            log.info("{}: {}", key, headers.get(key));
        });
    }
}
