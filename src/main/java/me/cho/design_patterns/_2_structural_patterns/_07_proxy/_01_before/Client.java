package me.cho.design_patterns._2_structural_patterns._07_proxy._01_before;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
