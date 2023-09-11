package com.example.demo.Employee;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class EmployeeService {
    public List<Employee> getEmployee(){
        return List.of(
                new Employee(

                        1l,
                        "Nimesha",
                        "nimesha@123gmail.com",
                        LocalDate.of(
                                2000,
                                Month.DECEMBER,
                                4

                        ),
                        23
                )
        );
    }

}
