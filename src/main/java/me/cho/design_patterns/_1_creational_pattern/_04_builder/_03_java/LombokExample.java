package me.cho.design_patterns._1_creational_pattern._04_builder._03_java;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
        System.out.println(trip);
    }

}
