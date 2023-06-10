package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._02_after;

import me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._01_before.Request;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handler(Request request){
        if (next != null) {
            next.handler(request);
        }
    }
}
