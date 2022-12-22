package me.cho.design_patterns._1_creational_pattern._01_singleton.practice;

public class Settings {
    
    // 1. 우선 생성자를 private으로 막고
    private Settings(){}
    
    // 2. static inner 클래스를 만들고
    private static class SettingsHolder{

        // 3. Settings 인스턴스를 만들고
        private static final Settings INSTANCE = new Settings();

    }

    // 4. static inner 클래스의 instance를 돌려준다.
    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }
    
}
