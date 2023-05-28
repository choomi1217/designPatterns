package me.cho.design_patterns._2_structural_patterns._07_proxy._01_before;

public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("Game Start!");
        Thread.sleep(1000);
    }
}
