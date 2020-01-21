package com.codeclan.example.Company.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name = "employee_number")
    private int employeeNumber;

    @JsonIgnoreProperties("employees")
    @OneToMany(mappedBy = "employee")
    @JoinColumn(name = "deptId", nullable = false)
    private Department department;

    @JsonIgnoreProperties(value = "employees")
    @ManyToMany
    @JoinTable(
            name = "employees_projecys",
            joinColumns = {
                    @JoinColumn(
                           name = "employee_id",
                            nullable = false,
                            updatable = false
                    )
    },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "project_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Project> projects;



    public Employee( String firstName, String lastName, int employeeNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}

