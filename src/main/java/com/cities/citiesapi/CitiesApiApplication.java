package com.cities.citiesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Responsável por prover as cidades, países e calculo de distâncias baseada na geolocalização
 *
 */
@SpringBootApplication
@EnableSwagger2 // allows Swagger
public class CitiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesApiApplication.class, args);
	}

}
