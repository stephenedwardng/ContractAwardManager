package com.example.user.contractawardmanager;

import behaviours.Cat;
import behaviours.Status;

/**
 * Created by user on 08/07/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Contract.deleteAll();
        Contract contract = new Contract("200 MacBook Pros", "Edward Ng", 1, Status.LIVE, Cat.IT, 3, "2017-07-07", "2018-07-07", 40000, 45000, "Procurement of new laptops for new location in Aberdeen");
        contract.save();
        Contract.all();

        Supplier.deleteAll();
        Supplier supplier = new Supplier("Tyrell Corporation", "SC 0754429", 9, 6, 8, 1, 1, 1);
        supplier.save();
        Supplier.all();
    }
}
