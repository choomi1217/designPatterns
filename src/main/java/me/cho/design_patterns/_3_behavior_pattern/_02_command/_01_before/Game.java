package me.cho.design_patterns._3_behavior_pattern._02_command._01_before;

public class Game extends Light {

    private boolean on;

    @Override
    public void on(){
        on = true;
        System.out.println("Light on");
    }

    @Override
    public void off(){
        on = false;
        System.out.println("Light off");
    }
}
