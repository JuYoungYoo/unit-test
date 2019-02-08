package com.juyoung.tdd.demo.service;

import com.juyoung.tdd.demo.domain.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
//@SpringBootTest
public class CarRepositoryTest {

    @Autowired
    private CarRepository repository;

    @Test
    public void getCar_returnsCarDetails() throws Exception {
        Car car = repository.findByName("prius");
        assertThat(car.getName()).isEqualTo("prius");
    }
}