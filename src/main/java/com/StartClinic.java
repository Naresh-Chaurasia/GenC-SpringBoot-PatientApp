package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.bt")
public class StartClinic {

	public static void main(String[] args) {
		SpringApplication.run(StartClinic.class, args);
	}

}
