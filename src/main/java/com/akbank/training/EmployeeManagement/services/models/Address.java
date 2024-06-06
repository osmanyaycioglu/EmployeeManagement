package com.akbank.training.EmployeeManagement.services.models;

public class Address {
    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(final String cityParam) {
        city = cityParam;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String streetParam) {
        street = streetParam;
    }
}