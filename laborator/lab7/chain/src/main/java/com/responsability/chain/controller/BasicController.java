package com.responsability.chain.controller;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/info")
    public ResponseEntity<String> getBasicInfo() {
        return ok("Basic response");
    }

}
