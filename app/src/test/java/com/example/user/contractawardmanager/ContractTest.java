package com.example.user.contractawardmanager;

import org.junit.Before;
import org.junit.Test;

import behaviours.Cat;
import behaviours.Status;

import static behaviours.Performance.RED;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/07/2017.
 */

public class ContractTest {

    Contract contract;

    @Test
    public void canGetTitle() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        assertEquals("200 MacBook Pros", contract.getTitle());
    }

    @Test
    public void canGetStatus() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        assertEquals(Status.LIVE, contract.getStatus());
    }

    @Test
    public void canGetStrategicImportanceRating() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        assertEquals(3, contract.getStrategicImportanceRating());
    }

    @Test
    public void canFindContract() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        contract.save();
        assertEquals("'200 MacBook Pros', 'Edward Ng', 1, 3, '2017-07-07', '2018-07-07', 40000, 45000, 'Procurement of new laptops for new location in Aberdeen'", contract.prettyContract(contract));
    }

    @Test
    public void canCalcChangeValue() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        assertEquals(-5000, contract.calcChangeValue());
    }

    @Test
    public void checkValuePerformance() {
        contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        assertEquals(RED, contract.valuePerformance());
    }

}
