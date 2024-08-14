package com.davidmarin.motivations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motivation;

    // Divad -> se añade "author"
    private String author;

    public Motivation() {
    }

    public Motivation(String motivation) {
        this.motivation = motivation;
    }

    // Divad -> se añade un constructor con "motivation" y "author"
    public Motivation(String motivation, String author) {
        this.motivation = motivation;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    // Divad -> se añaden getter y setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
