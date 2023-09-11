package com.example.demo.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/employee")
public class EmployeeController {
 private final EmployeeService employeeservice;
 @Autowired
    public EmployeeController(EmployeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping
    public List<Employee> getStudent(){
  return employeeservice.getEmployee();
    }

}
