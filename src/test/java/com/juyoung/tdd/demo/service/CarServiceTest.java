package com.juyoung.tdd.demo.service;

import com.juyoung.tdd.demo.CarNotFoundException;
import com.juyoung.tdd.demo.domain.Car;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)  // how, many ..
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;
    private CarService carService;

    @Before
    public void setUp() throws Exception {
        carService = new CarService(carRepository);
    }

    @Test
    public void getCarDetails_returnsCarInfo() throws Exception {
        given(carRepository.findByName("prius")).willReturn(new Car("prius","hybrid"));

//        Car car = carService.getCarDetails("prius");

//        assertThat(car.getName()).isEqualTo("prius");
//        assertThat(car.getType()).isEqualTo("hybrid");
    }


    @Test(expected = CarNotFoundException.class)
    public void getCarDetails_whenCarNotFound() throws Exception {
        given(carRepository.findByName("prius")).willReturn(null);

        carService.getCarDetails("prius");
    }
}