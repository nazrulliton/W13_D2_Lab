package com.codeclan.example.Company.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name")
    private String projectName;
    @Column (name = "duration")
    private int duration;
    @JsonIgnoreProperties(value = "projects")
    @ManyToMany
    @JoinTable(
            name = "employees_projects",

            joinColumns = {
                    @JoinColumn(
                    name = "project_id",
            nullable = false,
            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "employee_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Employee> employees;




    public Project(Long id, String projectName, int duration) {
        this.id = id;
        this.projectName = projectName;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
