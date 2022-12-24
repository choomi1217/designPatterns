package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._03_java;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShipFactoryExample {

    public static void main(String[] args) {
        /*
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/src/main/resources/config.xml");
        Ship oomiShip = applicationContext.getBean("oomiShip ", Ship.class);
        System.out.println(oomiShip.getName());
        */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship ship = applicationContext.getBean(Ship.class);
        System.out.println(ship);

    }

}
