package com.cities.citiesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.citiesapi.entity.State;
import com.cities.citiesapi.service.StateService;

import io.swagger.annotations.Api;

/**
 * End point dos países
 *
 */
@RestController
@RequestMapping("states")
@Api(tags = "/states", value = "Grupo de API's para manipulação de estados")
public class StateController {

	@Autowired
	private StateService service;

	/**
	 * Lista todos os estados
	 * 
	 * @param page
	 * @return
	 */
	@GetMapping
	public Page<State> states(final Pageable page) {
		return service.findAll(page);
	}
}
