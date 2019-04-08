package com.codecool.talkabot.controller;

import com.codecool.talkabot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

    @Autowired
    HelloWorldService service;

    @GetMapping("/helloworld")
    public String getMessage() {
        return service.getHelloWorld().get(0).getMessage();
    }
}
