package me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8;

/**
 * java8의 경우 interface에 private 메소드 사용이 불가능 하므로 전부 추상화 시켜버리겠습니다.
 * */
public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    void validate(String name, String email);

    void prepareFor(String name);
    void sendEmailTo(String email, Ship ship);

}
