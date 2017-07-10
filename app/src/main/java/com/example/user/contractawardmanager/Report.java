package com.example.user.contractawardmanager;

import java.sql.ResultSet;
import java.sql.SQLException;

import db.SqlRunner;

/**
 * Created by user on 10/07/2017.
 */

public class Report {


    public Report() {
    }

    public int totalActualSpend() {
        int total = 0;
        String sql = "SELECT SUM(actualValue) FROM contracts;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try {
            while(rs.next()) {
                total += rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        SqlRunner.closeConnection();
        return total;

    }
}
