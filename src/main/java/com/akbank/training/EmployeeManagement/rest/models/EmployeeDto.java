package com.akbank.training.EmployeeManagement.rest.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public class EmployeeDto {
    @NotBlank
    @Size(min = 2,max = 15,message = "2 ile 15 arasında olmalı")
    private String name;
    @NotEmpty
    @Size(min = 3,max = 25)
    private String surname;
    @NotNull
    @Min(40)
    @Max(300)
    private Integer weight;
    @NotNull
    @Min(100)
    @Max(200)
    private Integer height;

    @Valid
    private AddressDto addressDto;

    @NotNull
    private String department;
    @Valid
    private List<PhoneDto> phoneDtos;

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
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

    public AddressDto getAddress() {
        return addressDto;
    }

    public void setAddress(final AddressDto addressDtoParam) {
        addressDto = addressDtoParam;
    }

    public List<PhoneDto> getPhones() {
        return phoneDtos;
    }

    public void setPhones(final List<PhoneDto> phoneDtoParams) {
        phoneDtos = phoneDtoParams;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

