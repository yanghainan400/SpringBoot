package com.example.cccue.Repository;

import com.example.cccue.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByPersonId(long id);
    @Query(value = "select name,level,male from person where person.dep_id=2",nativeQuery = true)
    List<Person> findByDepartmentList();
}
