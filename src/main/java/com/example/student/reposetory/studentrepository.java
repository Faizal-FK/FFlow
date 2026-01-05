package com.example.student.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.student.model.Student;

public interface studentrepository extends JpaRepository<Student, Long> {
}
