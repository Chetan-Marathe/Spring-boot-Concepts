package com.example.EmployeeApp1.controller;



import com.example.EmployeeApp1.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.*;

//Marks this class as a controller
@Controller
@ResponseBody //As we are passing a body in a response
public class EmployeeController {

    //Employee is nothing but an entity that will exist in our code
    @RequestMapping("/employees")
    public List<Employee> FindAllEmployees(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"first employee","Pune"),
                new Employee(2,"Second employee","Bhegadewadi")
        );

        return employeeList;

    }
}

