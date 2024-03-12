package com.example.testback1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private 

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
