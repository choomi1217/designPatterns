package me.cho.design_patterns._3_behavior_pattern._02_command._01_before;

public class MyApp {
    private final Light light;

    public MyApp(Light light) {
        this.light = light;
    }

    public void pressed() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
    }

}
