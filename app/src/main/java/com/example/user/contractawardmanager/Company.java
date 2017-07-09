package com.example.user.contractawardmanager;

/**
 * Created by user on 09/07/2017.
 */

public class Company {

    protected String name;
    protected String registration;

    public Company(String name, String registration) {
        this.name = name;
        this.registration = registration;
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
}
