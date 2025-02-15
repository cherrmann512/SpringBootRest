package com.application.rest.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.rest.entities.Maker;
import com.application.rest.repository.MakerRepository;

@Component
public class MakerDAOImpl implements MakerDAO{

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
       makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);
    }
    
}
