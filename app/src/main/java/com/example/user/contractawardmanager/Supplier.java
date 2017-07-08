package com.example.user.contractawardmanager;
import java.sql.ResultSet;
import db.SqlRunner;

/**
 * Created by user on 08/07/2017.
 */

public class Supplier {

    private String name;
    private String registration;
    private int financialScore;
    private int valueScore;
    private int deliveryScore;
    private int exclude;
    private int insurance;
    private int courtJudgement;

    public Supplier(String name, String registration, int financialScore, int valueScore, int deliveryScore, int exclude, int insurance, int courtJudgement) {
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

    public int isExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }

    public int isInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int isCourtJudgement() {
        return courtJudgement;
    }

    public void setCourtJudgement(int courtJudgement) {
        this.courtJudgement = courtJudgement;
    }
}
