package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.service.Collegeservice;
import com.example.Collegeinfo.service.Departmentservice;
import com.example.Collegeinfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class Collegecontroller {
    @Autowired
    private Collegeservice cservice;

    @Autowired
    private Departmentservice dservice;

    @Autowired
    private Facultyservice fservice;
    @PostMapping("/addcollege")
    public College addcollege(@RequestBody College college) {
        return cservice.addCollege(college);
    }
    @PostMapping("/addcolleges")
    public List<College> addcolleges (@RequestBody List < College > colleges) {
        return cservice.createcolleges(colleges);
    }
    @GetMapping("/colleges")
    public List<College> getcolleges() {
        return cservice.getcolleges();
    }
    @GetMapping("/college/{id}")
    public College getcollege(@PathVariable int id) {
        return cservice.getcollege(id);
    }
    @GetMapping("/college/{name}")
    public College getcollege(@PathVariable String name) {
        return cservice.getcollege(name);
    }
    @DeleteMapping("/college/{id}")
    public String deletecollege(@PathVariable int id) {
        return cservice.deletecollege(id);
    }
    @PutMapping("/college/{id}")
    public College updatecollege(@PathVariable int id, @RequestBody College college) {
        return cservice.updatecollege(id,college);
    }


}