package me.cho.design_patterns._3_behavior_pattern._02_command._02_after;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Game;
import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Light;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void pressed(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if(!commands.isEmpty()){
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.pressed(new GameStartCommand(new Game()));
        button.pressed(new LightOnCommand(new Light()));
        button.pressed(new GameEndCommand(new Game()));
        button.undo();
        button.undo();
    }
}
