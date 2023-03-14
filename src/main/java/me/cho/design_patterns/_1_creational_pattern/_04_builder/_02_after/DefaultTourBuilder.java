package me.cho.design_patterns._1_creational_pattern._04_builder._02_after;

import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.DetailPlan;
import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder{

    TourPlan tourPlan;

    @Override
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.tourPlan.setNight(nights);
        this.tourPlan.setDay(days);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        if(whereToStay.isBlank()){
            this.tourPlan.setWhereToStay(whereToStay);
        }
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.tourPlan.addPlan(day, plan);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
