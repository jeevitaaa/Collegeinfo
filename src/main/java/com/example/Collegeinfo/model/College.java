package com.example.Collegeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="college")
public class College {
    @Id
    public int id;
    public String name;
    public String address;
    public String phone;
    public String email;
    public String establishedYear;
    public String website;
    public String courses;
    @OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    public List<Department> departments;
    @OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    public List<Faculty> faculties;
}
