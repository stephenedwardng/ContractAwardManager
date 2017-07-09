package com.example.user.contractawardmanager;

import static behaviours.Status.EXPIRED;
import static behaviours.Status.PIPELINE;

/**
 * Created by user on 09/07/2017.
 */

public class Manager {

    Supplier supplier;
    Contract contract;

    public Manager(Supplier supplier) {
        this.supplier = supplier;
    }

    public Manager(Supplier supplier, Contract contract) {
        this.supplier = supplier;
        this.contract = contract;
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

    public boolean checkStatusOpenToSuppliers() {
        if (contract.getStatus() == PIPELINE || contract.getStatus() == EXPIRED) {
            return true;
        } else return false;
    }

}
