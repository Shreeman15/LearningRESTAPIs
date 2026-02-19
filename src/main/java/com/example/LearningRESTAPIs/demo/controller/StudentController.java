package com.example.LearningRESTAPIs.demo.controller;
// which is used for create student relected apis
// this @RestController is having @Controller,@ResponseBody
//@Controller : u  can make controller which is used for handler mapping
//@ResponseBody : which tells about that the response should be in the form of the JSON not HTML
// student controller ka bean apne aap mein hein springboot handle karega
import com.example.LearningRESTAPIs.demo.entity.Student;
import com.example.LearningRESTAPIs.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getStudentData(){
        return studentRepository.findAll();
    }
}
