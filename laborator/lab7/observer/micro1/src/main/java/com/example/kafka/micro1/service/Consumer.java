package com.example.kafka.micro1.service;

import org.springframework.messaging.MessageHeaders;

import com.example.kafka.micro1.model.User;

public interface Consumer {

    public void consume(User user, MessageHeaders headers);

}
