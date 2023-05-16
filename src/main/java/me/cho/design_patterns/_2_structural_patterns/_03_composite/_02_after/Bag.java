package me.cho.design_patterns._2_structural_patterns._03_composite._02_after;

import lombok.Getter;
import me.cho.design_patterns._2_structural_patterns._03_composite._01_before.Item;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();
    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component:: getPrice).sum();
    }
}
