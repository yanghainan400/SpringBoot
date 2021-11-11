package com.example.cccue.Controller;

import com.example.cccue.Entity.Mession;
import com.example.cccue.Repository.MessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mession")
public class MessionController {
    @Autowired
    private MessionRepository messionRepository;

    @GetMapping("{id}")
    public Mession findMessionById(@PathVariable("id") long id) {
        return messionRepository.findMessionByMessionId(id);
    }

    @PostMapping("")
    public boolean addNewMession(Mession mession) {
        try {
            messionRepository.save(mession);
        } catch (Exception e) {
            System.out.println(mession.getName());
            return false;
        }
        return true;
    }
    @GetMapping("{id}/plist")
    public List<Mession> findMessionListByPid(@PathVariable("id") long id){
        return messionRepository.findAllBypPersonId(id);
    }
    @GetMapping("{id}/flist")
    public List<Mession> findMessionListByFid(@PathVariable("id") long id){
        return messionRepository.findAllByfPersonId(id);
    }
}
