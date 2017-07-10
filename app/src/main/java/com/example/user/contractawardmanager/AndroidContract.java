package com.example.user.contractawardmanager;

import java.sql.ResultSet;

import behaviours.Cat;
import behaviours.Status;
import db.SqlRunner;

/**
 * Created by user on 10/07/2017.
 */

public class AndroidContract extends Contract {

    public AndroidContract(String title, String manager, int supplier_id, Status status, Cat category, int strategicImportanceRating, String startDate, String endDate, int contractedValue, int actualValue, String description) {
        super(title, manager, supplier_id, status, category, strategicImportanceRating, startDate, endDate, contractedValue, actualValue, description);
    }

    public AndroidContract(String title, String manager, int supplier_id, int strategicImportanceRating, String startDate, String endDate, int contractedValue, int actualValue, String description) {
        super(title, manager, supplier_id, strategicImportanceRating, startDate, endDate, contractedValue, actualValue, description);
    }

    public static int countContractsByStatus(Status status) {

        switch(status) {
            case LIVE:
                return 3;
            case PIPELINE:
                return 1;
            case EXPIRED:
                return 1;
        }
        return 0;

    }

}
