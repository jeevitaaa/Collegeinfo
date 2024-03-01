package com.example.Collegeinfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "faculty")
public class Faculty {
    @Id
    @Column(name = "id")
    @NotNull
    public int id;
    public String name;
    public String designation;
    public String email;
    public String phone;
    @ManyToOne
    @JoinColumn(name = "college_id")
    @JsonIgnore
    public College college;

}
