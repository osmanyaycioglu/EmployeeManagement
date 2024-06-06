package com.akbank.training.EmployeeManagement.mappers;

import com.akbank.training.EmployeeManagement.rest.models.AddressDto;
import com.akbank.training.EmployeeManagement.rest.models.EmployeeDto;
import com.akbank.training.EmployeeManagement.rest.models.PhoneDto;
import com.akbank.training.EmployeeManagement.services.models.Address;
import com.akbank.training.EmployeeManagement.services.models.Employee;
import com.akbank.training.EmployeeManagement.services.models.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IEmployeeMapper {
    IEmployeeMapper mapper = Mappers.getMapper(IEmployeeMapper.class);

    Employee toEmployee(EmployeeDto employeeDto);

    EmployeeDto toEmployeeDto(Employee employee);

    Address toAddress(AddressDto address);

    AddressDto toAddressDto(Address address);

    Phone toPhone(PhoneDto phone);

    PhoneDto toPhoneDto(Phone phone);

}

