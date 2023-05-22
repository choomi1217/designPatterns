package me.cho.design_patterns._2_structural_patterns._06_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cached = new HashMap<>();

    public Font getFont(String font){
        if(cached.containsKey(font)){
            return cached.get(font);
        }else{
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cached.put(split[0], newFont);
            return newFont;
        }
    }

}
