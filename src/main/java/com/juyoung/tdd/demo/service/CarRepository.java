package com.juyoung.tdd.demo.service;


import com.juyoung.tdd.demo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
    Car findByName(String name);
}
