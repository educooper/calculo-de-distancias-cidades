package com.cities.citiesapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representação das cidades por classe.
 *
 */
@Entity
@Table(name = "cidade")
@TypeDefs(value = { @TypeDef(name = "point", typeClass = PointType.class) })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private Integer uf;

	private Integer ibge;

	// 1st
	@Column(name = "lat_lon")
	private String geolocation;

	// 2nd
	@Type(type = "point")
	@Column(name = "lat_lon", updatable = false, insertable = false)
	private Point location;

}
