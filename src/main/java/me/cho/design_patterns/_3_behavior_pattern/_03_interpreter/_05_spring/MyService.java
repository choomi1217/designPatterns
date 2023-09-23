package me.cho.design_patterns._3_behavior_pattern._03_interpreter._05_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class MyService implements ApplicationRunner {

    @Value("${1}")
    private String value;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(value);
    }
}
