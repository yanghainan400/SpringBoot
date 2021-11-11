package com.example.cccue.Service;

import com.example.cccue.Entity.Department;
import com.example.cccue.Entity.Person;
import com.example.cccue.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DepartmentService {
    public Department findByDepartmentId(Long id);
    public List<Department> findAll();
}
