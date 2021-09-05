package com.github.educooper.citiesapi.cities.resources;

import com.github.educooper.citiesapi.cities.entities.City;
import com.github.educooper.citiesapi.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

  /* 1st
  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }
  PRIMEIRA IMPLEMENTAÇÃO - |Trás todas as cidades sem, paginação - oneroso para o DB
  */

    // 2nd - Pageable - Retorno paginado de 50 em 50 itens - BEM MELHOR
    @GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }
}
