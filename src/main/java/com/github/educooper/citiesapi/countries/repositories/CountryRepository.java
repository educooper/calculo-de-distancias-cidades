package com.github.educooper.citiesapi.countries.repositories;

import com.github.educooper.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
