package com.example.springbeginner.repositories;

import com.example.springbeginner.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
