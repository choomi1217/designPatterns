package me.cho.design_patterns._1_creational_pattern.singleton.singleton2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = context.getBean("hello" , String.class);
        String hello2 = context.getBean("hello" , String.class);
        System.out.println(hello == hello2);
    }

}
