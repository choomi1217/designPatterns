package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._03_java;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.OomiShip;
import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.Ship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new OomiShip();
        ship.setName("oomi");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
