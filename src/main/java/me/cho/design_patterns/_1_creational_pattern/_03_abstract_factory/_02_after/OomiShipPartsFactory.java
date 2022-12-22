package me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after;

import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before.OomiAnchor;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before.OomiWheel;

public class OomiShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new OomiAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new OomiWheel();
    }
}
