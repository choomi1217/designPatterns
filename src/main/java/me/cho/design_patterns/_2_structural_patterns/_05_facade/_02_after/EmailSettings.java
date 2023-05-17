package me.cho.design_patterns._2_structural_patterns._05_facade._02_after;

public class EmailSettings {
    private String host;

    public EmailSettings(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}
