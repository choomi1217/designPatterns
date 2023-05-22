package me.cho.design_patterns._2_structural_patterns._06_flyweight._02_after;

public class Char {
    private char value;
    private String color;
    private Font font;

    public Char(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
