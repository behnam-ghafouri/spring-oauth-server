package com.example.demoapi2.models.internal_models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="students")
public class Student {

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 360)
    private String name;

    private Integer age;

    public Student() { }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
