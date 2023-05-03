package me.cho.design_patterns._2_structural_patterns._03_composite._01_before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Bag {

    List<Item> itemList = new ArrayList<>();
    public void add(Item item) {
        itemList.add(item);
    }
}
