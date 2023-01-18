package com.example.kafka.micro1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.micro1.service.UserProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final UserProducer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafka(@RequestParam("message") String name) {
        this.producer.sendMessage(name);
    }
}
