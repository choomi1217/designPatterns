package me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8;

import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before.OomiAnchor;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._01_before.OomiWheel;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after.Anchor;
import me.cho.design_patterns._1_creational_pattern._03_abstract_factory._02_after.Wheel;

public class Ship {

    String logo;
    String color;
    String name;
    String email;

    private Anchor anchor;
    private Wheel wheel;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "logo='" + logo + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
