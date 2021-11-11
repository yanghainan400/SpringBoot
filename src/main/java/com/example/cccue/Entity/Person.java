package com.example.cccue.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personId;
    private String name;
    private boolean male;
    private String level;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;
}
