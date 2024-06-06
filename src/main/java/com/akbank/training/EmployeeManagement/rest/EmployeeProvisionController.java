package com.akbank.training.EmployeeManagement.rest;

import com.akbank.training.EmployeeManagement.mappers.IEmployeeMapper;
import com.akbank.training.EmployeeManagement.rest.models.EmployeeDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.akbank.training.EmployeeManagement.services.EmployeeProvisionService;
import com.akbank.training.EmployeeManagement.services.models.Employee;

@RestController
@RequestMapping("/api/v1/employee/provision")
public class EmployeeProvisionController {
    private EmployeeProvisionService employeeProvisionService;

    public EmployeeProvisionController(final EmployeeProvisionService employeeProvisionServiceParam) {
        employeeProvisionService = employeeProvisionServiceParam;
    }

    @PostMapping("/add")
    public String add(@RequestBody  @Valid EmployeeDto employeeDtoParam) {
        return  employeeProvisionService.add(IEmployeeMapper.mapper.toEmployee(employeeDtoParam));
    }

    @GetMapping("/suspend")
    public String suspend(@RequestParam String customerId) {
        return "silindi";
    }

}