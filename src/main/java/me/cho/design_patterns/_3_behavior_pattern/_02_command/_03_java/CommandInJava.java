package me.cho.design_patterns._3_behavior_pattern._02_command._03_java;

import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Game;
import me.cho.design_patterns._3_behavior_pattern._02_command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                light.on();
            }
        });
        executorService.submit(() -> light.off());
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.shutdown();
    }
}
