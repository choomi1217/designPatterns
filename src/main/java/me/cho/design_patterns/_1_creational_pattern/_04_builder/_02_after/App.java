package me.cho.design_patterns._1_creational_pattern._04_builder._02_after;

import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan japanTour = director.japanTour();

        director = new TourDirector(new DefaultTourBuilder());
        TourPlan ganwondoTour = director.ganwondoTour();

        System.out.println(japanTour);
        System.out.println(ganwondoTour);

    }

}

