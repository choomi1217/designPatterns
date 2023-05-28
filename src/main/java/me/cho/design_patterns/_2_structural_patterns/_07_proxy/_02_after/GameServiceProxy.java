package me.cho.design_patterns._2_structural_patterns._07_proxy._02_after;

import me.cho.design_patterns._2_structural_patterns._07_proxy._01_before.GameService;

public class GameServiceProxy extends GameService {
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("Game Start Time : " + (System.currentTimeMillis() - before));
    }
}
