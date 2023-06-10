package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._02_after;

import me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._01_before.Request;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handler(Request request) {
        System.out.println("Auth : " + request.getBody());
        super.handler(request);
    }
}
