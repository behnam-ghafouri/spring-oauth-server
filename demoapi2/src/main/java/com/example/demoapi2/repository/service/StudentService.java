package com.example.demoapi2.repository.service;

import com.example.demoapi2.models.internal_models.Student;
import com.example.demoapi2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Async
    public CompletableFuture<Optional<Student>> findStudentByAgeAsync(Integer Age) {
        System.out.println(Age+" is QUERY " + Thread.currentThread().getName());
        return studentRepository.getStudentByAge(Age);
    }

    @Async
    public CompletableFuture<Student> findStudentAsync(String name) {
        return studentRepository.findByName(name);
    }


    public Student saveStudentAsync(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudentsAsync(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public void deleteStudentAsync() {
        studentRepository.deleteAllInBatch();
    }


    public List<Student> findAllStudentOrderByAge() {
        return studentRepository.findAll(Sort.by("age"));
    }
}
