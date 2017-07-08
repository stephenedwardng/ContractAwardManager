package com.example.user.contractawardmanager;
import java.sql.ResultSet;
import db.SqlRunner;

/**
 * Created by user on 08/07/2017.
 */

public class Supplier {

    private int id;
    private String name;
    private String registration;
    private int financialScore;
    private int valueScore;
    private int deliveryScore;
    private int exclude;
    private int insurance;
    private int courtJudgement;

    public Supplier(String name, String registration, int financialScore, int valueScore, int deliveryScore, int exclude, int insurance, int courtJudgement) {
        this.name = name;
        this.registration = registration;
        this.financialScore = financialScore;
        this.valueScore = valueScore;
        this.deliveryScore = deliveryScore;
        this.exclude = exclude;
        this.insurance = insurance;
        this.courtJudgement = courtJudgement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getFinancialScore() {
        return financialScore;
    }

    public void setFinancialScore(int financialScore) {
        this.financialScore = financialScore;
    }

    public int getValueScore() {
        return valueScore;
    }

    public void setValueScore(int valueScore) {
        this.valueScore = valueScore;
    }

    public int getDeliveryScore() {
        return deliveryScore;
    }

    public void setDeliveryScore(int deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    public int isExclude() {
        return exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }

    public int isInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int isCourtJudgement() {
        return courtJudgement;
    }

    public void setCourtJudgement(int courtJudgement) {
        this.courtJudgement = courtJudgement;
    }


    // CRUD begins

    public void save() {
        String sql = String.format("INSERT INTO suppliers (name, registration, financialScore, valueScore, deliveryScore, exclude, insurance, courtJudgement) " +
                "VALUES ('%s', %d, %d, %d, %d, %d, %d, %d)", this.name, this.registration, this.financialScore, this.valueScore, this.deliveryScore, this.exclude, this.insurance, this.courtJudgement);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void all() {
        String sql = "SELECT * FROM suppliers;";
        ResultSet rs = SqlRunner.executeQuery(sql);

        try {
            while (rs.next()) {
                String name = rs.getString("name");
                int registration = rs.getInt("registration");
                int financialScore = rs.getInt("financialScore");
                int valueScore = rs.getInt("valueScore");
                int deliveryScore = rs.getInt("deliveryScore");
                int exclude = rs.getInt("exclude");
                int insurance = rs.getInt("insurance");
                int courtJudgement = rs.getInt("courtJudgement");


                System.out.println("Name: " + name);
                System.out.println("Registration: " + registration);
                System.out.println("Financial Score: " + financialScore);
                System.out.println("Value Score: " + valueScore);
                System.out.println("Delivery Score: " + deliveryScore);
                System.out.println("Exclude: " + exclude);
                System.out.println("Insurance: " + insurance);
                System.out.println("Court Judgement: " + courtJudgement);
            }
        }catch (Exception ex) {
            System.exit(0);
        } finally {
            SqlRunner.closeConnection();
        }

    }

    public static void deleteAll() {
        String sql = "DELETE FROM contracts;";
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public void delete() {
        String sql = String.format("DELETE FROM contracts WHERE id = %d;", this.id);
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public void update() {
        String sql = String.format("UPDATE contracts SET title = '%s', manager = '%s', supplier_id = %d, status = '%s', category = '%s', strategicImportanceRating = %d, startDate = '%s', endDate = '%s', contractedValue = '%s', actualValue = '%s', description = '%s' WHERE id = %d;", this.title, this.manager, this.supplier_id, this.status, this.category, this.strategicImportanceRating, this.startDate, this.endDate, this.contractedValue, this.actualValue, this.description);
        SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

}
