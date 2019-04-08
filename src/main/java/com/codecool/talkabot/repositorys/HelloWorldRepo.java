package com.codecool.talkabot.repositorys;

import com.codecool.talkabot.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepo extends JpaRepository<HelloWorld,Long> {
}
