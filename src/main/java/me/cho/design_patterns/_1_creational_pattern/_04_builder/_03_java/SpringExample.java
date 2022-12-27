package me.cho.design_patterns._1_creational_pattern._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.cho.me")
                .path("java playlist ep1")
                .build().encode();
        System.out.println(howToStudyJava);
    }

}
