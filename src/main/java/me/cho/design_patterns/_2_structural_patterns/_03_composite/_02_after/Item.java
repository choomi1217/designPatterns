package me.cho.design_patterns._2_structural_patterns._03_composite._02_after;

import lombok.Getter;

@Getter
public class Item implements Component {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
