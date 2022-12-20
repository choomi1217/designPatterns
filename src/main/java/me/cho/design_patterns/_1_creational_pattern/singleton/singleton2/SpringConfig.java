package me.cho.design_patterns._1_creational_pattern.singleton.singleton2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String hello(){
        return "hello";
    }
}
