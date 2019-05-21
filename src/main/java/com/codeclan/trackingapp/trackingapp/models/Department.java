package com.codeclan.trackingapp.trackingapp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
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
