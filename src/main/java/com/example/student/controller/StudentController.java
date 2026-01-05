package com.example.student.controller;

import org.springframework.web.bind.annotation.*;
import com.example.student.model.Student;
import com.example.student.reposetory.studentrepository;

@RestController
public class StudentController {

    private final studentrepository repo;

    public StudentController(studentrepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String home() {
        return "Student App Running with Aiven DB via ENV";
    }

    @PostMapping("/add")
    public Student addStudent(@RequestParam String name) {
        Student s = new Student();
        s.setName(name);
        return repo.save(s);
    }
}
