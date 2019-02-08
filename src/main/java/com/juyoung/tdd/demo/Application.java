package com.juyoung.tdd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration, @EnableAutoConfiguration, @EnableWebMvc, @ComponentScan을 포함
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

