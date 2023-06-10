package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._02_after;

import me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._01_before.Request;

public class Client {

    RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork(String request) {
        this.requestHandler.handler(new Request(request));
    }

    public static void main(String[] args) {
        RequestHandler requestHandler =  new PrintRequestHandler(new AuthRequestHandler(new LoggingRequestHandler(null)));
        Client client = new Client(requestHandler);
        client.doWork("무궁화 꽃이 피었습니다.");
    }
}
