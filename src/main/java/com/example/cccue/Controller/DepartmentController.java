package com.example.cccue.Controller;

import com.example.cccue.Entity.Department;
import com.example.cccue.Entity.Person;
import com.example.cccue.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dep")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping("")
    public boolean addDepartment(Department department){
        departmentRepository.save(department);
        return true;
    }
    @GetMapping("{id}")
    public Department findDepartment(@PathVariable("id") Long id){
        return departmentRepository.findByDepartmentId(id);
    }
    @GetMapping("/list")
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

}
