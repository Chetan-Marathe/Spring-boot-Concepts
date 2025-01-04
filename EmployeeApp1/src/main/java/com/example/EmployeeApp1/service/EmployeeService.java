package com.example.EmployeeApp1.service;

import com.example.EmployeeApp1.entity.Employee;
import com.example.EmployeeApp1.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class EmployeeService {

    ArrayList<Employee> employeelist = new ArrayList<>(Arrays.asList(
            new Employee(1,"Shailesh","Pune"),
            new Employee(2,"Shree","Kolhapur")
    ));

    //With the help of autowired annotation it is initialized with the instance of repository
    //automatic injecttion of dependencies is done
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> Getallemployess(){
//        return employeelist;
        return employeeRepository.findAll();

    }

    public Employee getanemployee(int id){
//        return employeelist.stream().filter(e -> (
//                e.getEmpid() == id)).findFirst().get();
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
    }

    @Transactional
    public void createEmployee(Employee employee){
////       employeelist.add(employee);
        employeeRepository.save(employee);
//        //NOw we are saving employee in the database

    }

    public void updateEmployee(Employee employee){
//        ArrayList<Employee> tempEmployee = new ArrayList<>();
//        for(Employee emp : employeelist){
//            if(emp.getEmpid()== employee.getEmpid()){
//                emp.setEmpname(employee.getEmpname());
//                emp.setEmpcity(employee.getEmpcity());
//            }
//            tempEmployee.add(emp);
//        }
//        this.employeelist=tempEmployee;
        employeeRepository.save(employee);

    }

    public void deleteEmployee(int id){
//        ArrayList<Employee> tempEmployee = new ArrayList<>();
//        for(Employee emp : employeelist){
//            if(emp.getEmpid() == id)
//                continue;
//            tempEmployee.add(emp);
//            }
//
//        this.employeelist=tempEmployee;
        employeeRepository.delete(employeeRepository.getById(id));
        }
    }



