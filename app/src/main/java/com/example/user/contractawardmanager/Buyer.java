package com.example.user.contractawardmanager;

import java.util.Date;

/**
 * Created by user on 09/07/2017.
 */

public class Buyer extends Company {

    private int budget;
    private String financialYearEnd;

    public Buyer(String name, String registration, int budget, String financialYearEnd) {
        super(name, registration);
        this.budget = budget;
        this.financialYearEnd = financialYearEnd;
    }

    public int getBudget() {
        return budget;
    }

    public String getFinancialYearEnd() {
        return financialYearEnd;
    }
}
