package com.example.LearningRESTAPIs.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// entity is database table structure
 // in real life it is like a  student fillup form
@Entity
@Getter
@Setter
public class Student {
   @Id
   // in this @id : Id tells JPA (Hibernate). this field is the primary key in the table
           // means in the db : id BIGINT PRIMARY KEY
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   // database is automatically increases the id
   private Long id;

   private String name;

   private String email;
}
