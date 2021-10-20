package com.cities.citiesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.entity.Country;
import com.cities.citiesapi.service.CountryService;

import io.swagger.annotations.Api;

/**
 * End point de países
 */
@RestController
@RequestMapping("countries")
@Api(tags="/countries", value="Grupo de API's para manipulação de paises")
public class CountryController {

	@Autowired
	private CountryService service;

	/**
	 * List all countries
	 * 
	 * @param page
	 * @return
	 */
	@GetMapping
	public Page<Country> countries(final Pageable page) {
		return service.findAll(page);
	}
}
