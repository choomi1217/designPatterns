package me.cho.design_patterns._2_structural_patterns._06_flyweight._02_after;

public final class Font {
    private final String fontFamily;
    private final int fontSize;

    public Font(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }
}
