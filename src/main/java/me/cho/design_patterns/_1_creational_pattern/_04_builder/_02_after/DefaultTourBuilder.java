package me.cho.design_patterns._1_creational_pattern._04_builder._02_after;

import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.DetailPlan;
import me.cho.design_patterns._1_creational_pattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder{

    private String title;

    private int night;

    private int day;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;
    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.night = nights;
        this.day = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = localDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        if(whereToStay.isBlank()){
            this.whereToStay = "";
        }
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if(this.plans == null){
            this.plans = new ArrayList<DetailPlan>();
        }
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title,night, day, startDate, whereToStay, plans);
    }
}
