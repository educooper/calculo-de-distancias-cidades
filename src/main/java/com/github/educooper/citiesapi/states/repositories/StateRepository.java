package com.github.educooper.citiesapi.states.repositories;

import com.github.educooper.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}