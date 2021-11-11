package com.example.cccue.Service;

import com.example.cccue.Entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    public List<Person> getList();
    public Person findByPersonId(long id);
    public List<Person> findByDepartmentList();
}
