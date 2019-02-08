package com.juyoung.tdd.demo.controller;

import com.juyoung.tdd.demo.CarNotFoundException;
import com.juyoung.tdd.demo.domain.Car;
import com.juyoung.tdd.demo.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{name}")
    private Car getCar(@PathVariable String name){
        return carService.getCarDetails(name);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private void carNotFoundHandler(CarNotFoundException ex){

    }
}
