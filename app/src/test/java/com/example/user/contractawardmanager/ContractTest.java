package com.example.user.contractawardmanager;

import org.junit.Before;
import org.junit.Test;

import behaviours.Cat;
import behaviours.Status;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/07/2017.
 */

public class ContractTest {

    Contract contract;

    @Before
    public void setup() {

        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");

    }

    @Test
    public void canGetTitle() {
        assertEquals("200 MacBook Pros", contract.getTitle());
    }

    @Test
    public void canGetStatus() {
        assertEquals(Status.LIVE, contract.getStatus());
    }

    @Test
    public void canGetStrategicImportanceRating() {
        assertEquals(3, contract.getStrategicImportanceRating());
    }

}
