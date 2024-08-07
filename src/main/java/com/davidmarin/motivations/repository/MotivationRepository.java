package com.davidmarin.motivations.repository;

import com.davidmarin.motivations.model.Motivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivationRepository extends JpaRepository<Motivation, Long> {

}
