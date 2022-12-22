package me.cho.design_patterns._1_creational_pattern._02_factory_method._04_using;

import me.cho.design_patterns._1_creational_pattern._02_factory_method._02_after.GgamjiShip;
import me.cho.design_patterns._1_creational_pattern._02_factory_method._02_after.OomiShip;

public class SimpleFactory {

    public Object createProduct(String name){
        if(name.equalsIgnoreCase("oomi")){
            return new OomiShip();
        }else if (name.equalsIgnoreCase("ggamji")) {
            return new GgamjiShip();
        }
        throw new IllegalArgumentException();
    }

}
