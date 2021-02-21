package com.back_end.back_end.controller;

import java.util.ArrayList;
import java.util.List;

import com.back_end.back_end.Repository.StudentRepository;
import com.back_end.back_end.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
StudentRepository studentRepository;
    
@GetMapping("/students")
  public ResponseEntity<List<Student>> getallStudents(@RequestParam(required = false)String name) {
    try {
        List<Student> students = new ArrayList<Student>(); 
    
        if (name == null)
          studentRepository.findAll().forEach(students::add);
        else
          studentRepository.findByNameContaining(name).forEach(students::add);
    
        if (students.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    
        return new ResponseEntity<>(students, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    
  }
  @PostMapping("/students") 
  public ResponseEntity<Student> createTutorial(@RequestBody Student student)
  {
    try{
            Student _student = studentRepository.save(new Student(student.getRollno(),student.getName(),student.getDob(),student.getStud_class(),student.getDivision(),student.getGender()));
            return new ResponseEntity<>(_student,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
          return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
  }
 
  
}