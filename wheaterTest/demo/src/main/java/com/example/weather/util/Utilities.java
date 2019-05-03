package com.example.weather.util;

public class Utilities {
	
	private static final float CONVERSION_VALUE = 273.15f;
	
	private Utilities() {}

	/**
	 * 
	 * @param parKelvin
	 * @return
	 */
	public static Float convertKtoC(Float parKelvin) {
		return parKelvin - CONVERSION_VALUE;
	}
	
	/**
	 * 
	 * @param parKelvin
	 * @return
	 */
	public static Float convertKtoF(Float parKelvin) {
		return (parKelvin - CONVERSION_VALUE) * (9f / 5f) + 32;
	}
	
}
