package com.example.LearningRESTAPIs.demo.service;

import com.example.LearningRESTAPIs.demo.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
