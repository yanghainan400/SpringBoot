package com.example.cccue.Repository;

import com.example.cccue.Entity.Mession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessionRepository extends JpaRepository<Mession, Long> {
    Mession findMessionByMessionId(long id);
    List<Mession> findAllByfPersonId(long id);
    List<Mession> findAllBypPersonId(long id);

}
