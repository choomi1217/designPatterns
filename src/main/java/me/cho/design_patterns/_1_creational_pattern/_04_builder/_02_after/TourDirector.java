package me.cho.design_patterns._1_creational_pattern._04_builder._02_after;

import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan japanTour(){
        return tourPlanBuilder.newInstance()
                .title("일본 료칸 여행")
                .startDate(LocalDate.of(2022, 12, 17))
                .whereToStay("일본 료칸")
                .nightAndDays(2, 3)
                .addPlan(0, "료칸 체크인")
                .addPlan(0, "료칸 석식 식사")
                .addPlan(1, "일본 편의점에서 조식 식사")
                .addPlan(1, "일본 동네 한바퀴")
                .addPlan(1, "근처 식당에서 점심 식사")
                .addPlan(1, "료칸 즐기기")
                .addPlan(1, "료칸 석식 식사")
                .addPlan(2, "호텔 체크 아웃")
                .addPlan(2, "공항 이동")
                .getPlan();
    }

    public TourPlan ganwondoTour(){
        return tourPlanBuilder.newInstance()
                .title("강원도 여행")
                .startDate(LocalDate.of(2022, 12, 24))
                .addPlan(0, "바다 보기")
                .addPlan(0, "회 먹기")
                .getPlan();
    }

}
