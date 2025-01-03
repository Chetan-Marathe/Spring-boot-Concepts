package com.example.EmployeeApp1.service;

import com.example.EmployeeApp1.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    List<Employee> employeelist = new ArrayList<>(Arrays.asList(
            new Employee(1,"Shailesh","Pune"),
            new Employee(2,"Shree","Kolhapur")
    ));

    public List<Employee> Getallemployess(){
        return employeelist;
    }

    public Employee getanemployee(int id){
        return employeelist.stream().filter(e -> (
                e.getEmpid() == id)).findFirst().get();
    }

    public void createEmployee(Employee employee){
       employeelist.add(employee);
    }

    public void updateEmployee(Employee employee){
        ArrayList<Employee> tempEmployee = new ArrayList<>();
        for(Employee emp : employeelist){
            if(emp.getEmpid()== employee.getEmpid()){
                emp.setEmpname(employee.getEmpname());
                emp.setEmpcity(employee.getEmpcity());
            }
            tempEmployee.add(emp);
        }
        this.employeelist=tempEmployee;
    }

    public void deleteEmployee(int id){
        ArrayList<Employee> tempEmployee = new ArrayList<>();
        for(Employee emp : employeelist){
            if(emp.getEmpid() == id)
                continue;
            tempEmployee.add(emp);
            }

        this.employeelist=tempEmployee;
        }
    }



