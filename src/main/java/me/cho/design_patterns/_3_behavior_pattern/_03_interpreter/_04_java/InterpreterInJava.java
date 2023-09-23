package me.cho.design_patterns._3_behavior_pattern._03_interpreter._04_java;

import java.util.regex.Pattern;

public class InterpreterInJava {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]{6}","abcdef"));
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\D","a"));
    }
}
