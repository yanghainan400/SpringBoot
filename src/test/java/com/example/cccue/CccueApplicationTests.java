package com.example.cccue;

import com.example.cccue.Repository.DepartmentRepository;
import com.example.cccue.Repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CccueApplicationTests {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Test
    void contextLoads() {

    }

}
