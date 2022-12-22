package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after;

public class OomiProPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new OomiAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new OomiWheelPro();
    }
}
