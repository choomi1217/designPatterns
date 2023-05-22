package me.cho.design_patterns._2_structural_patterns._06_flyweight._01_before;

public class Char {
    char value;
    String color;
    String fontFamily;
    int fontSize;
    public Char(char value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
