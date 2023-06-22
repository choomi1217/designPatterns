package me.cho.design_patterns._3_behavior_pattern._02_command._02_after;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Light;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
