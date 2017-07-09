package com.example.user.contractawardmanager;

/**
 * Created by user on 09/07/2017.
 */

public class Manager {

    Supplier supplier;

    public Manager(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean checkExcluded() {
        if (supplier.isExclude() == 1) {
            return true;
        } else return false;
    }

    public boolean checkInsurance() {
        if (supplier.hasInsurance() == 1) {
            return true;
        } else return false;
    }

    public boolean checkCourtJudgement() {
        if (supplier.hasCourtJudgement() == 1) {
            return true;
        } else return false;
    }

    public boolean screenForEligibility() {
        if (checkExcluded() == false && checkInsurance() == true && checkCourtJudgement() == false) {
            return true;
        } else return false;
    }

}
