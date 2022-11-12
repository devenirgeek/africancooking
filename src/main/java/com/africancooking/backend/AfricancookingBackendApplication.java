package com.africancooking.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AfricancookingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricancookingBackendApplication.class, args);

	}

}
