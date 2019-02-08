package com.juyoung.tdd.demo;

import com.juyoung.tdd.demo.domain.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
//    @Test(timeout = 5000)   // 5s time limited
//    @Test(expected=RuntimeException.class)  // exception 발생 안할 시 Fail
    public void getCar_returnsCarDetails() throws Exception {
        // given, arrange

        // when, act
        ResponseEntity<Car> response = restTemplate
                .getForEntity("/cars/prius", Car.class);


        // then, assert
//        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getName()).isEqualTo("prius");
        assertThat(response.getBody().getType()).isEqualTo("hybird");
    }
}

