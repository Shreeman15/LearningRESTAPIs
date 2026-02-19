package com.example.LearningRESTAPIs.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import tools.jackson.core.PrettyPrinter;

//@Data
//@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;

    // constructor
    public StudentDto(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters and setters

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public  String getEmail(){
        return email;
    }
}
