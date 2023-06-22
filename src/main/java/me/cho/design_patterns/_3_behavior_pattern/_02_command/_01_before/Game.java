package me.cho.design_patterns._3_behavior_pattern._02_command._01_before;

public class Game {

    private boolean on;

    public void start(){
        on = true;
        System.out.println("Game on");
    }

    public void end(){
        on = false;
        System.out.println("Game off");
    }
}
