package com.restuarant.restuarant;

import org.springframework.boot.SpringApplication;

public class TestRestuarantApplication {

	public static void main(String[] args) {
		SpringApplication.from(RestuarantApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
