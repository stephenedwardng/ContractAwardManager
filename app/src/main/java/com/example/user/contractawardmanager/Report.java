package com.example.user.contractawardmanager;

/**
 * Created by user on 10/07/2017.
 */

public class Report {

    Buyer buyer;

    public Report(Buyer buyer) {

        this.buyer = buyer;

    }

    public int percentageBudgetSpent() {

        double fractionSpent = (double)buyer.totalActualSpend() / (double)buyer.getBudget();
        return (int) Math.rint(fractionSpent * 100);

    }

}
