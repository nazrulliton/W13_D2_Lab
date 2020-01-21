package com.codeclan.example.Company.controllers;

import com.codeclan.example.Company.models.Department;
import com.codeclan.example.Company.models.Employee;
import com.codeclan.example.Company.repositories.DepartmentRepository;
import com.codeclan.example.Company.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class employeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
