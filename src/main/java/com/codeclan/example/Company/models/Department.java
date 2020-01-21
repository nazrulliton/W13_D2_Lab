package com.codeclan.example.Company.models;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "employees")
    private ArrayList<Employee> employees;

    public Department(Long id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
