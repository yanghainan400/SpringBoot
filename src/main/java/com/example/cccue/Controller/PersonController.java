package com.example.cccue.Controller;

import com.example.cccue.Entity.Person;
import com.example.cccue.Repository.DepartmentRepository;
import com.example.cccue.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/list")
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @PostMapping("")
    public boolean addPerson(@RequestBody Person person) {
        try {
            personRepository.save(person);
            if(person.getDepartment()!=null){
                departmentRepository.save(person.getDepartment());
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Long id) {
        return personRepository.findByPersonId(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) {
        try {
            personRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
//    @GetMapping("/list")
//    public List<Person> findByDepartmentList(){
//        return personRepository.findByDepartmentList();
//    }
}
