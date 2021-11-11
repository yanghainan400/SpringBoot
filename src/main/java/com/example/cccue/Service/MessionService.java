package com.example.cccue.Service;

import com.example.cccue.Entity.Mession;

import java.util.List;

public interface MessionService {
    Mession findMessionByMessionId(long id);
    List<Mession> findAllByfPersonId(long id);
    List<Mession> findAllBypPersonId(long id);
}
