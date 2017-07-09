package com.example.user.contractawardmanager;

import org.junit.Before;
import org.junit.Test;

import behaviours.Cat;
import behaviours.Status;

import static behaviours.Performance.RED;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/07/2017.
 */

public class ManagerTest {

    Supplier supplier;
    Contract contract;
    Manager manager;

    @Test
    public void canCheckExcluded_true() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 1, 1, 0);
        manager = new Manager(supplier);
        assertEquals(true, manager.checkExcluded());
    }

    @Test
    public void canCheckExcluded_false() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        manager = new Manager(supplier);
        assertEquals(false, manager.checkExcluded());
    }

    @Test
    public void canCheckHasInsurance_true() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        manager = new Manager(supplier);
        assertEquals(true, manager.checkInsurance());
    }

    @Test
    public void canCheckHasInsurance_false() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 0, 0);
        manager = new Manager(supplier);
        assertEquals(false, manager.checkInsurance());
    }

    @Test
    public void canCheckHasCourtJudgement_true() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 1);
        manager = new Manager(supplier);
        assertEquals(true, manager.checkCourtJudgement());
    }

    @Test
    public void canCheckHasCourtJudgement_false() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        manager = new Manager(supplier);
        assertEquals(false, manager.checkCourtJudgement());
    }

    @Test
    public void canScreenForEligibility__supplier_passes() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        manager = new Manager(supplier);
        assertEquals(true, manager.screenForEligibility());
    }

    @Test
    public void canScreenForEligibility__supplier_fails() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 1);
        manager = new Manager(supplier);
        assertEquals(false, manager.screenForEligibility());
    }

    @Test
    public void canCheckStatusOpenToSuppliers__contract_open() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.PIPELINE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        manager = new Manager(supplier, contract);
        assertEquals(true, manager.checkStatusOpenToSuppliers());
    }

    @Test
    public void canCheckStatusOpenToSuppliers__contract_locked() {
        supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 0, 1, 0);
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        manager = new Manager(supplier, contract);
        assertEquals(false, manager.checkStatusOpenToSuppliers());
    }
}
