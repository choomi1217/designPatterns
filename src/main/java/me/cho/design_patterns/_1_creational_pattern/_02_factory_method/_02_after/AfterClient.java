package me.cho.design_patterns._1_creational_pattern._02_factory_method._02_after;

public class AfterClient {

    public static void main(String[] args) {
        AfterClient client = new AfterClient();
        client.print(new OomiFactory(), "oomiShip","oomi1217@naver.com");
        client.print(new GgamjiFactory(), "ggamjiShip","ggamji@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }

}
