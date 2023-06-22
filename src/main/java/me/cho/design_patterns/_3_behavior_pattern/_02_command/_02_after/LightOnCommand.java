package me.cho.design_patterns._3_behavior_pattern._02_command._02_after;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Light;

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
