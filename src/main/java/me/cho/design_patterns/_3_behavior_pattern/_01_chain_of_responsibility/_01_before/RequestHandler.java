package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._01_before;

public class RequestHandler {
    public void handler(Request request){
        System.out.println(request.getBody());
    }
}
