package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory(){
        return new ShipFactory();
    }

}
