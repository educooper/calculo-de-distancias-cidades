package com.cities.citiesapi.service;

import io.swagger.annotations.ApiModel;

/**
 * Enum representa a unidade em radianos
 * 
 *
 */
@ApiModel(value = "EarthRadius", description = "Unidade de medida de retorno da distância")
public enum EarthRadius {

	METERS("m", 6378168), KILOMETERS("km", 6378.168f), MILES("mi", 3958.747716f);

	private final String unit;
	private final float value;

	EarthRadius(final String unit, final float value) {
		this.unit = unit;
		this.value = value;
	}

	public float getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}
}
