package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car(2011, "Toyota", "Corolla");
        repository.save(car);

        car = new Car(2001, "Ford", "Ka");
        repository.save(car);

        car = new Car(1950, "Volkswagen", "Beetle");
        repository.save(car);
    }
}
