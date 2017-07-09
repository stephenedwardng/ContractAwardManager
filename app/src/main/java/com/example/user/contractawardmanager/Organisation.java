package com.example.user.contractawardmanager;

import java.util.Date;

/**
 * Created by user on 09/07/2017.
 */

public class Organisation {

    private int budget;
    private Date financialYearEnd;

    public Organisation(int budget, Date financialYearEnd) {
        this.budget = budget;
        this.financialYearEnd = financialYearEnd;
    }

    public int getBudget() {
        return budget;
    }

    public Date getFinancialYearEnd() {
        return financialYearEnd;
    }
}
