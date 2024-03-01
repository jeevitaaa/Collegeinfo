package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface facultyrepo extends JpaRepository<Faculty, Integer> {
}
