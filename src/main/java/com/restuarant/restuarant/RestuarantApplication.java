package com.restuarant.restuarant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.restuarant.*"})
@SpringBootApplication
public class RestuarantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestuarantApplication.class, args);
	}

}
