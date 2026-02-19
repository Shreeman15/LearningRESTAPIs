package com.example.LearningRESTAPIs.demo.repository;

import com.example.LearningRESTAPIs.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
