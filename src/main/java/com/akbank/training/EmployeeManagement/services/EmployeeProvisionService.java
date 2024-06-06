package com.akbank.training.EmployeeManagement.services;

import com.akbank.training.EmployeeManagement.services.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProvisionService {

    public String add(Employee employeeParam){
        return "OK";
    }
}