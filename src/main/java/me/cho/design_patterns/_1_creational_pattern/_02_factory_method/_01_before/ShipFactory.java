package me.cho.design_patterns._1_creational_pattern._02_factory_method._01_before;

public class ShipFactory {


    public static Ship orderShip(String name, String email) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요!");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요!");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if(name.equalsIgnoreCase("oomi")){
            ship.setLogo("😺");
            ship.setColor("pink");
        }else if(name.equalsIgnoreCase("ggamji")){
            ship.setLogo("🐶");
            ship.setColor("black");
        }

        sendEmailTo(email);

        return ship;

    }

    private static void prepareFor(String name) {
        System.out.println(name + "준비 중");
    }

    private static void sendEmailTo(String email) {
        System.out.println(email + "이메일 발송 완료");
    }
}
