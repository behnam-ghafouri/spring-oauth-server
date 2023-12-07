package com.example.demoapi2.controllers;


import com.example.demoapi2.models.internal_models.Student;
import com.example.demoapi2.repository.service.StudentService;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.findAllStudentOrderByAge();
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> addStudents(@RequestBody List<Student> students){
        var test = students;
        try {
            List<Student> result = studentService.saveStudentsAsync(students);
            return ResponseEntity.ok(result.stream().count() == students.stream().count());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }





}
