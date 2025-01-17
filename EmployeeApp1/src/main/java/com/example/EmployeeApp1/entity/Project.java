//One project can be associated with multiple employees and one employee can be associated with multiple projects

package com.example.EmployeeApp1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String clientName;

    public Project(){

    }

    public Project(int id, String name, String client_name) {
        this.id = id;
        this.name = name;
        this.clientName = client_name;
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

    public String getClient_name() {
        return clientName;
    }

    public void setClient_name(String client_name) {
        this.clientName = client_name;
    }
}
