package me.cho.design_patterns._1_creational_pattern._02_factory_method._03_java8;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void validate(String name, String email) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요!");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요!");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + "준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 제작 완료");
    }
}
