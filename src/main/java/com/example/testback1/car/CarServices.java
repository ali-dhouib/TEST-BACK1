package com.example.testback1.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServices {

    @Autowired
    private CarRepository carRepository;
}
