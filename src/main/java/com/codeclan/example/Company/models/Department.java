package com.codeclan.example.Company.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    @Column(name = "dept_name")
    private String deptName;

    @JsonIgnoreProperties("departments")
    @ManyToOne
    private List<Employee> employees;

    public Department( String deptName) {
        this.deptName = deptName;
    }
    public Department(){

    }

    public Long getId() {
        return deptId;
    }

    public void setId(Long id) {
        this.deptId = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
