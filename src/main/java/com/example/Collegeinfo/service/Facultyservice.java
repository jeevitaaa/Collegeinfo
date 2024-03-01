package com.example.Collegeinfo.service;


import com.example.Collegeinfo.repository.departmentrepo;
import com.example.Collegeinfo.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Facultyservice {
    @Autowired
    public facultyrepo frepo;
    @Autowired
    public departmentrepo drepo;

}