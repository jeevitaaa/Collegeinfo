package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.repository.collegerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class Collegeservice {
    @Autowired
    private collegerepo crepo;

    public College addCollege(College college) {
        return crepo.save(college);
    }

    public List<College> createcolleges(List<College> students) {

        return crepo.saveAll(students);
    }

    public List<College> getcolleges() {
        return crepo.findAll();
    }

    public College getcollege(int id) {
        return crepo.findById(id).orElse(null);
    }

    public String deletecollege(int id) {
        crepo.deleteById(id);
        return "college removed !! " + id;
    }

    public College getcollege(String name) {
        return crepo.findByName(name);
    }

    public College updatecollege(int id, College updateCollege) {
        Optional<College> optionalCollege = crepo.findById(id);
        if (optionalCollege.isPresent()) {
            College existingCollege = optionalCollege.get();
            existingCollege.setName(updateCollege.getName());
            return crepo.save(existingCollege);
        } else {
            throw new RuntimeException("College not found with id: " + id);
        }
    }
}

