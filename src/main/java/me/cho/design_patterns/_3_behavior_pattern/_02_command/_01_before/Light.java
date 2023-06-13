package me.cho.design_patterns._3_behavior_pattern._02_command._01_before;

public class Light {

    private boolean on;

    public void on(){
        on = true;
        System.out.println("Light on");
    }

    public void off(){
        on = false;
        System.out.println("Light off");
    }

}
