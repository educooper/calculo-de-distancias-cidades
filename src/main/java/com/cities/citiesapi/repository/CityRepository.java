package com.cities.citiesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cities.citiesapi.entity.City;

/**
 * Class para acesso a Cidade
 *
 */
public interface CityRepository extends JpaRepository<City, Long> {

	/**
	 * Metodo calcula distancia entre 2 pontos
	 * @param cityId1
	 * @param cityId2
	 * @return
	 */
	@Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
	Double distanceByPoints(final Long cityId1, final Long cityId2);

	/**
	 * Metodo calcula distancia entre duas cidades com cube entre 2 pontos
	 * @param lat1
	 * @param lon1
	 * @param lat2
	 * @param lon2
	 * @return
	 */
	@Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) as distance", nativeQuery = true)
	Double distanceByCube(final Double lat1, final Double lon1, final Double lat2, final Double lon2);
	
	/**
	 * Procurar cidade pelo nome
	 * @param name
	 * @return
	 */
	City findByName(String name);
	
	/**
	 * Listar cidades por UF
	 * @param uf
	 * @return
	 */
	List<City> findByUf(Integer uf);

}
