package com.example.cccue.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String name;
    private String brief;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Person> personList;
}
