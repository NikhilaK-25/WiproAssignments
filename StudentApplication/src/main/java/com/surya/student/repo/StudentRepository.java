package com.surya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.surya.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
