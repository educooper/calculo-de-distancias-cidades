package com.cities.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.citiesapi.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
