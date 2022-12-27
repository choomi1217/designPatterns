package me.cho.design_patterns._1_creational_pattern._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Stream.Builder<String> streamStringBuilder = Stream.builder();
        Stream<String> stringStream = streamStringBuilder.add("Hello").add("oomi").build();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = Stream.<String>builder().add("Hi").add("oomi").build();
        stringStream2.forEach(System.out::println);
    }
}
