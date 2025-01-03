package com.example.EmployeeApp1.service;

import com.example.EmployeeApp1.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    List<Employee> employeelist = Arrays.asList(
            new Employee(1,"Shailesh","Pune"),
            new Employee(2,"Shree","Kolhapur")
    );

    public List<Employee> Getallemployess(){
        return employeelist;
    }
}

//When springboot initialized instance of service class is registered and we can use it in other class
