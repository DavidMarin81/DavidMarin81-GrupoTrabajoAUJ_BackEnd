package com.davidmarin.motivations.controller;

import com.davidmarin.motivations.model.Motivation;
import com.davidmarin.motivations.service.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motivations")
public class MotivationController {

    private MotivationService service;

    @Autowired
    public MotivationController(MotivationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Motivation> getAllMotivations() {
        return service.getAllMotivations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motivation> getMotivationById(@PathVariable Long id) {
        Optional<Motivation> motivation = service.getMotivationById(id);
        return motivation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Motivation createMotivation(@RequestBody Motivation motivation) {
        return service.saveMotivation(motivation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Motivation> updateMotivation(@PathVariable Long id, @RequestBody Motivation motivation) {
        if (service.getMotivationById(id).isPresent()) {
            motivation.setId(id);
            return ResponseEntity.ok(service.saveMotivation(motivation));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMotivation(@PathVariable Long id) {
        if (service.getMotivationById(id).isPresent()) {
            service.deleteMotivation(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
