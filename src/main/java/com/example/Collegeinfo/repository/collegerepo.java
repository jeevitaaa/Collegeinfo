package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface collegerepo extends JpaRepository<College, Integer> {
    College findByName(String name);
}
