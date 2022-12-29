package me.cho.design_patterns._1_creational_pattern._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student oomi = new Student("oomi");
        Student ggamji = new Student("ggamji");
        List<Student> students = new ArrayList<>();
        students.add(oomi);
        students.add(ggamji);

        List<Student> clone = new ArrayList<>(students);
        //ArrayList<Student> clone = (ArrayList<Student>) students.clone();
        System.out.println(clone);

    }

}
