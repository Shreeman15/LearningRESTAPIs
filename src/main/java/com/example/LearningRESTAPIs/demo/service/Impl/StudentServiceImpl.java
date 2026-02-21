package com.example.LearningRESTAPIs.demo.service.Impl;

import com.example.LearningRESTAPIs.demo.dto.StudentDto;
import com.example.LearningRESTAPIs.demo.entity.Student;
import com.example.LearningRESTAPIs.demo.repository.StudentRepository;
import com.example.LearningRESTAPIs.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {

        List<Student> students =
                studentRepository.findAll();

        List<StudentDto> studentDtoList =
                students.stream()
                        .map(student -> new StudentDto(
                                student.getId(),
                                student.getName(),
                                student.getEmail()
                        ))
                        .toList();

        return studentDtoList;
    }
}
