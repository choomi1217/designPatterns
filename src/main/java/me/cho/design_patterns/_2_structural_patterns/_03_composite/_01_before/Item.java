package me.cho.design_patterns._2_structural_patterns._03_composite._01_before;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
