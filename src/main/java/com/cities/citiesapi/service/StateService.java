package com.cities.citiesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cities.citiesapi.entity.State;
import com.cities.citiesapi.repository.StateRepository;

@Service
public class StateService {

	
	@Autowired
	private StateRepository repo;
	
	public Page<State> findAll(final Pageable page) {
		return repo.findAll(page);
	}
}
