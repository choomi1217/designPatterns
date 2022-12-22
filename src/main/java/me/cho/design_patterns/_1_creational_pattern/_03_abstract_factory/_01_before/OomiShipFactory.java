package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.DefaultShipFactory;
import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.OomiShip;
import me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8.Ship;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after.ShipPartsFactory;

public class OomiShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public OomiShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {

        Ship ship = new OomiShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
