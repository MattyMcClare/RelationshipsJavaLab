package com.codeclan.trackingapp.trackingapp.models;


import java.util.ArrayList;
import java.util.List;


public class Department {
    private Long id;
    private String name;
    private List<Employee> employess;

    public Department(String name) {
        this.id = id;
        this.name = name;
        this.employess = new ArrayList<>();
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployess() {
        return employess;
    }

    public void setEmployess(List<Employee> employess) {
        this.employess = employess;
    }
}
