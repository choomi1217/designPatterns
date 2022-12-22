package me.cho.design_patterns._1_creational_pattern._02_factory_method._02_after;

public class OomiFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new OomiShip();
    }
}
