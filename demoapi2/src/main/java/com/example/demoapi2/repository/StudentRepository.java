package com.example.demoapi2.repository;

import com.example.demoapi2.models.internal_models.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAll(Sort sort);
    CompletableFuture<Optional<Student>> getStudentByAge(Integer Age);
    CompletableFuture<Student> findByName(String Name);

    Student saveAndFlush(Student student);

    void deleteAllInBatch();
}
