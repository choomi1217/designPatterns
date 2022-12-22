package me.cho.design_patterns._1_creational_pattern._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship oomiShip = ShipFactory.orderShip("oomi", "oomi1217@naver.com");
        System.out.println(oomiShip);

        Ship ggamjiShip = ShipFactory.orderShip("ggamji", "ggamji@google.com");
        System.out.println(ggamjiShip);

    }

}
