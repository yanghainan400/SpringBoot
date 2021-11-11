package com.example.cccue.Service.impl;

import com.example.cccue.Entity.Department;
import com.example.cccue.Entity.Person;
import com.example.cccue.Repository.DepartmentRepository;
import com.example.cccue.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department findByDepartmentId(Long id) {
        return departmentRepository.findByDepartmentId(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
