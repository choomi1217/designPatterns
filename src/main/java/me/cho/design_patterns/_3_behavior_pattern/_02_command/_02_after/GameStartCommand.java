package me.cho.design_patterns._3_behavior_pattern._02_command._02_after;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Game;

public class GameStartCommand implements Command{

    private final Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
