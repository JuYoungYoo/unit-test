package com.juyoung.tdd.demo.service;

import com.juyoung.tdd.demo.CarNotFoundException;
import com.juyoung.tdd.demo.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        Car car = carRepository.findByName(name);
        if(car == null){
            throw new CarNotFoundException();
        }
        return car;
    }
}
