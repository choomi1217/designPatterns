package me.cho.design_patterns._3_behavior_pattern._02_command._02_after;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Game;

public class GameEndCommand implements Command{

    private final Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
