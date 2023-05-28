package me.cho.design_patterns._2_structural_patterns._07_proxy._03_after;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() throws InterruptedException {
        System.out.println("Game Start!");
        Thread.sleep(1000);
    }
}
