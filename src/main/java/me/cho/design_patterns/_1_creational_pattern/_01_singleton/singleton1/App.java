package me.cho.design_patterns._1_creational_pattern._01_singleton.singleton1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Setting setting1 = Setting.getInstance();
        Setting setting2 = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(setting1);
        }

        try(ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            setting2 = (Setting) input.readObject();
        }

        System.out.println(setting1 == setting2);

    }

}
