package me.cho.design_patterns._3_behavior_pattern._02_command._01_before;

public class MyApp {
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void pressed() {
        game.start();
    }

    public static void main(String[] args) {
        MyApp app = new MyApp(new Game());
        app.pressed();
        app.pressed();
        app.pressed();
        app.pressed();
    }

}
