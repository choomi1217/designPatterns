package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._03_java;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShipFactoryExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship oomiShip = applicationContext.getBean("oomiShip ", Ship.class);
        System.out.println(oomiShip.getName());
    }

}
