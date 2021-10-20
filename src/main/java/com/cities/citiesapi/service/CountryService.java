package com.cities.citiesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cities.citiesapi.entity.Country;
import com.cities.citiesapi.repository.CountryRepository;


/**
 * Classe responsável por identificar países
 * 
 *
 */
@Service
public class CountryService {


	@Autowired
	private CountryRepository repo;
	
	public Page<Country> findAll(final Pageable page) {
		return repo.findAll(page);
	}
}
