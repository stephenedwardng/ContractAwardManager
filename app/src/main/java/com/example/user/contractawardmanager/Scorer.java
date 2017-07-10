package com.example.user.contractawardmanager;

/**
 * Created by user on 10/07/2017.
 */

public class Scorer {

    Scorable supplier;
    Contract contract;

    public Scorer(Scorable supplier) {
        this.supplier = supplier;
    }

    public Scorer(Scorable supplier, Contract contract) {
        this.supplier = supplier;
        this.contract = contract;
    }

    public int scoreSupplier() {
        double overallScore = supplier.getFinancialScore() + supplier.getValueScore() + supplier.getDeliveryScore();
        return (int) Math.rint((overallScore / 3) * 10);
    }
}
