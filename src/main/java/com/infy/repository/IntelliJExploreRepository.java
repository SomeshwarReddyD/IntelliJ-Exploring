package com.infy.repository;

import com.infy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntelliJExploreRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}
