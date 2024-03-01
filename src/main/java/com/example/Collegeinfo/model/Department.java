package com.example.Collegeinfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department {
    @Id
    @Column(name = "id")
    public int id;
    public String name;
    @ManyToOne
    @JoinColumn(name = "college_id")
    @JsonIgnore
    public College college;
}
