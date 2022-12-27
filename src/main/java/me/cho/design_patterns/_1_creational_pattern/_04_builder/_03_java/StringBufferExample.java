package me.cho.design_patterns._1_creational_pattern._04_builder._03_java;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        String result = stringBuffer.append("hello, ").append("hi").toString();
        System.out.println(result);
    }
}
