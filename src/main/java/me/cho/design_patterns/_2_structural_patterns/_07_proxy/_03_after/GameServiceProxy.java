package me.cho.design_patterns._2_structural_patterns._07_proxy._03_after;

public class GameServiceProxy implements GameService{

    private GameService gameService;
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (gameService == null) {
            gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println("Game Start Time : " + (System.currentTimeMillis() - before));
    }
}
