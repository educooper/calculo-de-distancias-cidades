package com.cities.citiesapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cities.citiesapi.entity.City;
import com.cities.citiesapi.repository.CityRepository;

/**
 * Class para manter Cidades
 *
 */
@Service
public class CityService {
	
	@Autowired
	private CityRepository repo;
	
	public Page<City> findAll(final Pageable page) {
		return repo.findAll(page);
	}
	
	public City findByName(String name) {
		return repo.findByName(name);
	}
	
	public List<City> findByUf(Integer idUf) {
		return repo.findByUf(idUf);
	}

}
