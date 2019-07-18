package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.lti")
@EntityScan("com.lti.entity")
public class AirlineReservation12Application {

	public static void main(String[] args) {
		SpringApplication.run(AirlineReservation12Application.class, args);
	}

}
  