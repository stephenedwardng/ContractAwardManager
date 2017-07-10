package com.example.user.contractawardmanager;

/**
 * Created by user on 10/07/2017.
 */

public class Award {

    private Supplier supplier;
    private Contract contract;
    private Screener screener;
    Scorer scorer;
    private final int AWARDTHRESHOLD = 80;

    public Award(Supplier supplier, Contract contract, Screener screener, Scorer scorer) {
        this.supplier = supplier;
        this.contract = contract;
        this.screener = screener;
        this.scorer = scorer;
    }

    public void awardContract() {
        if (screener.screenForEligibility() == true && scorer.scoreSupplier() > AWARDTHRESHOLD) {

        }
    }

}
