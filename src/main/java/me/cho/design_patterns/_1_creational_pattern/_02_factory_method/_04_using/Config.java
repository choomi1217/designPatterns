package me.cho.design_patterns._1_creational_pattern._02_factory_method._04_using;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hi(){
        return "hi";
    }
}
