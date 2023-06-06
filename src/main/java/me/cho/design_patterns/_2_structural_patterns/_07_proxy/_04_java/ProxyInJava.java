package me.cho.design_patterns._2_structural_patterns._07_proxy._04_java;

import me.cho.design_patterns._2_structural_patterns._07_proxy._03_after.DefaultGameService;
import me.cho.design_patterns._2_structural_patterns._07_proxy._03_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) throws InterruptedException {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() throws InterruptedException {
        GameService gameservice = getGameservice(new DefaultGameService());
        gameservice.startGame();
    }

    private GameService getGameservice(GameService targer){
        return (GameService) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{GameService.class},
                ((proxy, method, args) -> {
                    System.out.println(" Hello, Dynamic Proxy! ");
                    method.invoke(targer,args);
                    return null;
                })
        );
    }

}
