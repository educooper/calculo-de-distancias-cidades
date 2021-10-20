package com.cities.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.citiesapi.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
