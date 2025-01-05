package com.example.EmployeeApp1.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "spouse")  //Table can be created with this name
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileno;
    private int age;


    //Bidirectional navigation done ie now we can also find employee name if we have spouse record
    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse(int id,String name,String mobileno,int age) {
        this.id = id;
        this.name=name;
        this.mobileno=mobileno;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
