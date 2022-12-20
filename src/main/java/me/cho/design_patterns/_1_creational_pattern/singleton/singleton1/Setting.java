package me.cho.design_patterns._1_creational_pattern.singleton.singleton1;

import java.io.Serializable;

public class Setting implements Serializable {

    private Setting() {}

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();
    }
    public static Setting getInstance(){
        return SettingHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

}
