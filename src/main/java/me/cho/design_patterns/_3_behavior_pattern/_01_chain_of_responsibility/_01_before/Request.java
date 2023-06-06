package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._01_before;

public class Request {
    private String body;
    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
