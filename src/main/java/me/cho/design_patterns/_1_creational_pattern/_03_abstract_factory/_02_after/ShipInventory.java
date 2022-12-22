package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.Ship;
import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.ShipFactory;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before.OomiShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipProFactory = new OomiShipFactory(new OomiProPartsFactory());
        Ship shipPro = shipProFactory.createShip();
        System.out.println(shipPro.getAnchor().getClass());
        System.out.println(shipPro.getWheel().getClass());

        ShipFactory shipFactory = new OomiShipFactory(new OomiShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }

}
