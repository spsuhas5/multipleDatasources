package com.example.multipledatasources.controller;

import com.example.multipledatasources.model.address.Address;
import com.example.multipledatasources.model.employee.Employee;
import com.example.multipledatasources.repository.address.AddressRepository;
import com.example.multipledatasources.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;

    @Autowired
    EmployeeController(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
    }

    @GetMapping("/empAddr/{id}")
    public String getEmployeeAddress(@PathVariable("id") Long empId) {
        System.out.println("id: "+empId);
        Employee employee = employeeRepository.findAllByEmpId(empId);
        Address address = addressRepository.findAllByEmpId(empId);
        if(Objects.nonNull(employee) && Objects.nonNull(address)) {
            return employee.getEmpName() + " : " + address.getEmpPinCode();
        }
        return "no record found for the id: "+empId;
    }
}
