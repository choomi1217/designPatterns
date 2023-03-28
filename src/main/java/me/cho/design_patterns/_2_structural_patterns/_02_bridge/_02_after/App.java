package me.cho.design_patterns._2_structural_patterns._02_bridge._02_after;

import me.cho.design_patterns._2_structural_patterns._02_bridge._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillE();
        poolParty아리.skillR();
    }
}
