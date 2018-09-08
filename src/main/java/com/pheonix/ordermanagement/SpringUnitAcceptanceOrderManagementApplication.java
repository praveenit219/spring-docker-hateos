package com.pheonix.ordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;


@EnableEntityLinks
@EnableHypermediaSupport(type = HypermediaType.HAL)
@SpringBootApplication
public class SpringUnitAcceptanceOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUnitAcceptanceOrderManagementApplication.class, args);
	}
}
