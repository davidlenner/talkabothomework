package com.codecool.talkabot.service;

import com.codecool.talkabot.model.HelloWorld;
import com.codecool.talkabot.repositorys.HelloWorldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldRepo helloWorldRepo;

    public List<HelloWorld> getHelloWorld() {
        System.out.println(helloWorldRepo.findAll().get(0).getMessage());
        return helloWorldRepo.findAll();
    }
}
