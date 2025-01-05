//One to one mapping
package com.example.EmployeeApp1.entity;
import jakarta.persistence.*;

import java.util.List;

//Employee needs to be converted into table and this class can persist
@Entity
public class Employee {
    //ID tells employeeid is primary key and employee id will be autogenerated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empid;
    String empname;
    String empcity;

    @OneToOne
    private Spouse spouse;

    public Employee(int empid , String empname , String empcity) {
        this.empid = empid;
        this.empname = empname;
        this.empcity = empcity;
    }

    public Employee(){

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpcity() {
        return empcity;
    }

    public void setEmpcity(String empcity) {
        this.empcity = empcity;
    }

    public Spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }


    @OneToMany
    private List<Addresses> addresses;
    //We are using list because many addresses


    public List<Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
    }

    @ManyToMany
    private List<Project> projects;
}

