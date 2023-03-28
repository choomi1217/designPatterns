package me.cho.design_patterns._2_structural_patterns._02_bridge._01_before;

public class Kda아리 implements Champion{
    @Override
    public void move() {
        System.out.println("kda 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("kda 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("kda 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("kda 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("kda 아리 R");
    }
}
