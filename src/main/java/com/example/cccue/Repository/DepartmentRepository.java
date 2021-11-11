package com.example.cccue.Repository;

import com.example.cccue.Entity.Department;
import com.example.cccue.Entity.Person;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long>, CrudRepository<Department,Long> {
    Department findByDepartmentId(Long id);
    List<Department> findAll();
}
