package me.cho.design_patterns._2_structural_patterns._07_proxy._02_after;

import me.cho.design_patterns._2_structural_patterns._07_proxy._01_before.GameService;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
