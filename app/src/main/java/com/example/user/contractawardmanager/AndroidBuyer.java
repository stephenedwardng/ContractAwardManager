package com.example.user.contractawardmanager;

/**
 * Created by user on 10/07/2017.
 */

public class AndroidBuyer extends Buyer {

    public AndroidBuyer(String name, String registration, int budget, String financialYearEnd) {
        super(name, registration, budget, financialYearEnd);
    }

    @Override
    public int totalActualSpend() {
        return 200000;
    }
}
