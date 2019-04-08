package com.codecool.talkabot.init;

import com.codecool.talkabot.model.HelloWorld;
import com.codecool.talkabot.repositorys.HelloWorldRepo;
import org.springframework.stereotype.Component;

@Component
public class Init {

    public Init(HelloWorldRepo helloWorldRepo) {

        helloWorldRepo.save(new HelloWorld("Hello World"));
    }
}
