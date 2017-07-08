package com.example.user.contractawardmanager;

/**
 * Created by user on 08/07/2017.
 */

public class Supplier {

    private String name;
    private String registration;
    private int financialScore;
    private int valueScore;
    private int deliveryScore;
    private boolean exclude;
    private boolean insurance;
    private boolean courtJudgement;

    public Supplier(String name, String registration, int financialScore, int valueScore, int deliveryScore, boolean exclude, boolean insurance, boolean courtJudgement) {
        this.name = name;
        this.registration = registration;
        this.financialScore = financialScore;
        this.valueScore = valueScore;
        this.deliveryScore = deliveryScore;
        this.exclude = exclude;
        this.insurance = insurance;
        this.courtJudgement = courtJudgement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getFinancialScore() {
        return financialScore;
    }

    public void setFinancialScore(int financialScore) {
        this.financialScore = financialScore;
    }

    public int getValueScore() {
        return valueScore;
    }

    public void setValueScore(int valueScore) {
        this.valueScore = valueScore;
    }

    public int getDeliveryScore() {
        return deliveryScore;
    }

    public void setDeliveryScore(int deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    public boolean isExclude() {
        return exclude;
    }

    public void setExclude(boolean exclude) {
        this.exclude = exclude;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public boolean isCourtJudgement() {
        return courtJudgement;
    }

    public void setCourtJudgement(boolean courtJudgement) {
        this.courtJudgement = courtJudgement;
    }
}
