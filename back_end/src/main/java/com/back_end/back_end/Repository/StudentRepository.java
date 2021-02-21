package com.back_end.back_end.Repository;


import java.util.List;

import com.back_end.back_end.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface StudentRepository extends MongoRepository<Student, String> {
  List<Student> findByNameContaining(String name);
  
}