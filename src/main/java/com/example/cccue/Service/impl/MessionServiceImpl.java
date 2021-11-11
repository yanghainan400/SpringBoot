package com.example.cccue.Service.impl;

import com.example.cccue.Entity.Mession;
import com.example.cccue.Repository.MessionRepository;
import com.example.cccue.Service.MessionService;

import java.util.List;

public class MessionServiceImpl implements MessionService {
    private MessionRepository messionRepository;
    @Override
    public Mession findMessionByMessionId(long id) {
        return messionRepository.findMessionByMessionId(id);
    }

    @Override
    public List<Mession> findAllByfPersonId(long id) {
        return messionRepository.findAllByfPersonId(id);
    }

    @Override
    public List<Mession> findAllBypPersonId(long id) {
        return messionRepository.findAllBypPersonId(id);
    }
}
