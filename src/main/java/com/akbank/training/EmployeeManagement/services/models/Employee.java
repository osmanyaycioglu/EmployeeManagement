package com.akbank.training.EmployeeManagement.services.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public class Employee {
    private String name;

    private String surname;

    private Integer weight;

    private Integer height;

    private Address address;

    private String department;

    private List<Phone> phones;

    public Address getAddressDto() {
        return address;
    }

    public void setAddressDto(Address address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(final Integer weightParam) {
        weight = weightParam;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(final Integer heightParam) {
        height = heightParam;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address addressParam) {
        address = addressParam;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(final List<Phone> phoneParams) {
        phones = phoneParams;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

