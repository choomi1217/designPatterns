package me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8;

public class GgamjiFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new GgamjiShip();
    }
}
