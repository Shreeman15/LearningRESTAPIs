package com.example.LearningRESTAPIs.demo.controller;
// which is used for create student relected apis
// this @RestController is having @Controller,@ResponseBody
//@Controller : u  can make controller which is used for handler mapping
//@ResponseBody : which tells about that the response should be in the form of the JSON not HTML
// student controller ka bean apne aap mein hein springboot handle karega
import com.example.LearningRESTAPIs.demo.dto.StudentDto;
import com.example.LearningRESTAPIs.demo.entity.Student;
import com.example.LearningRESTAPIs.demo.repository.StudentRepository;
import com.example.LearningRESTAPIs.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }
}
