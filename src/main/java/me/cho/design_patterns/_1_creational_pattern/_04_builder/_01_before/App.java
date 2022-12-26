package me.cho.design_patterns._1_creational_pattern._04_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourPlan tourPlan= new TourPlan();
        tourPlan.setTitle("일본 여행");
        tourPlan.setNight(2);
        tourPlan.setDay(3);
        tourPlan.setStartDate(LocalDate.of(2022,12,24));
        tourPlan.setWhereToStay("료칸");
        tourPlan.addPlan(0, "체크인 후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 료칸 요리");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 료칸 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "온천 체험");
        tourPlan.addPlan(1, "석식 료칸 요리");
        tourPlan.addPlan(2, "조식 일본 편의점 음식");
        tourPlan.addPlan(2, "체크아웃");

        System.out.println(tourPlan);

    }

}
