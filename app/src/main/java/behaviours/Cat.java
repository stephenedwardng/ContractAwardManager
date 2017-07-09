package behaviours;

/**
 * Created by user on 07/07/2017.
 */

public enum Cat {
    IT("IT"),
    FACILITIES("Facilities Management"),
    TELECOM("Telecom"),
    INSURANCE("Insurance"),
    HR("HR"),
    PLANT("Plant"),
    MARKETING("Marketing");

    private String categoryType;

    Cat(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryType() {
        return this.categoryType;
    }

}
