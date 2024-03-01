package com.example.Collegeinfo.service;

import com.example.Collegeinfo.repository.collegerepo;
import com.example.Collegeinfo.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Departmentservice {
    @Autowired
    public departmentrepo drepo;
    @Autowired
    public collegerepo crepo;


}
