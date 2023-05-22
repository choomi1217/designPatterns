package me.cho.design_patterns._2_structural_patterns._06_flyweight._02_after;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Char ch1 = new Char('h', "white",fontFactory.getFont("aria:14"));
        Char ch2 = new Char('e', "white",fontFactory.getFont("aria:14"));
        Char ch3 = new Char('l', "white",fontFactory.getFont("aria:14"));
        Char ch4 = new Char('l', "white",fontFactory.getFont("aria:14"));
        Char ch5 = new Char('o', "white",fontFactory.getFont("aria:14"));
    }
}
