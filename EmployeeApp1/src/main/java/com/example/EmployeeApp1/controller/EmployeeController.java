package com.example.EmployeeApp1.controller;



import com.example.EmployeeApp1.entity.Employee;
import com.example.EmployeeApp1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping("/employees/{id}")
    public Employee findAnEmployee(@PathVariable int id){
        return employeeservice.getanemployee(id);
    }
    //pathvariable is used to pass parameter onto the url and accept those parameters

//    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee){
        employeeservice.createEmployee(employee);
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.PUT)
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){
        employeeservice.updateEmployee(employee);
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.DELETE)
    public List<Employee> deleteEmployee(@PathVariable int id){
        employeeservice.deleteEmployee(id);
        return employeeservice.Getallemployess();
    }
}

