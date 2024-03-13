package com.example.testback1.catalog;

import com.example.testback1.car.Car;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class GarageCatalog {
    @Id
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "garageCatalog")
    private Set<Car> cars = new HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
