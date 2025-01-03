package com.example.EmployeeApp1.controller;



import com.example.EmployeeApp1.entity.Employee;
import com.example.EmployeeApp1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.*;


@Controller
@ResponseBody //As we are passing a body in a response
public class EmployeeController {

    @Autowired
    EmployeeService employeeservice;//We are creating instance of service


    @RequestMapping("/employees")
    public List<Employee> FindAllEmployees(){


        return employeeservice.Getallemployess();

    }
}

