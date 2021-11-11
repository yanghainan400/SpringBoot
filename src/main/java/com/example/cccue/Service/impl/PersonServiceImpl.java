package com.example.cccue.Service.impl;

import com.example.cccue.Entity.Person;
import com.example.cccue.Repository.PersonRepository;
import com.example.cccue.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getList() {
        return personRepository.findAll();
    }

    @Override
    public Person findByPersonId(long id) {
        return personRepository.findByPersonId(id);
    }

    @Override
    public List<Person> findByDepartmentList() {
        return personRepository.findByDepartmentList();
    }
}
