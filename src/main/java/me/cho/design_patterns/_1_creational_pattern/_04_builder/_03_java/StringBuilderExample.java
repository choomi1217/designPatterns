package me.cho.design_patterns._1_creational_pattern._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("hi,").append(" hello").toString();
        System.out.println(result);
    }

}
