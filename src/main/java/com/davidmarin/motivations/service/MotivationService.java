package com.davidmarin.motivations.service;

import com.davidmarin.motivations.model.Motivation;
import com.davidmarin.motivations.repository.MotivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotivationService {
    private MotivationRepository repository;

    @Autowired
    public MotivationService(MotivationRepository repository) {
        this.repository = repository;
    }

    public List<Motivation> getAllMotivations() {
        return repository.findAll();
    }

    public Optional<Motivation> getMotivationById(Long id) {
        return repository.findById(id);
    }

    public Motivation saveMotivation(Motivation motivation) {
        return repository.save(motivation);
    }

    public void deleteMotivation(Long id) {
        repository.deleteById(id);
    }
}
