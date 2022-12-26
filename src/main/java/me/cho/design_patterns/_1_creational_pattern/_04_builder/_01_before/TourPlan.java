package me.cho.design_patterns._1_creational_pattern._04_builder._01_before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TourPlan {

    private String title;

    private int night;

    private int day;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    public TourPlan(String title, int night, int day, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.night = night;
        this.day = day;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    public TourPlan() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }

    @Override
    public String toString() {

        StringBuilder plansString = new StringBuilder();

        plans.stream().map(detailPlan -> {
            return detailPlan.getDay() + " : " + detailPlan.getPlan() + "\n";
        }).forEach(plansString::append);

        return "TourPlan{" + "\n" +
                "title = '" + title + '\'' + "\n" +
                ", night = " + night + "\n" +
                ", day = " + day + "\n" +
                ", startDate = " + startDate + "\n" +
                ", whereToStay = '" + whereToStay + '\'' + "\n" +
                ", plans = "
                + plansString
                + '}';
    }

    public void addPlan(int day, String plan) {
        if(this.plans == null){
            this.plans = new ArrayList<DetailPlan>();
        }
        DetailPlan detailPlan = new DetailPlan(day, plan);
        plans.add(detailPlan);
    }
}
