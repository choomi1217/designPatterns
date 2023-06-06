package me.cho.design_patterns._2_structural_patterns._07_proxy._05_spring;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void startGame() {
        System.out.println("Game Start!");
    }

}
