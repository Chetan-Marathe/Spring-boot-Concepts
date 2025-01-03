package com.example.EmployeeApp1.entity;
public class Employee {
    int empid;
    String empname;
    String empcity;

    public Employee(int empid , String empname , String empcity) {
        this.empid = empid;
        this.empname = empname;
        this.empcity = empcity;
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


}

