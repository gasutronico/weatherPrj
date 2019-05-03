package com.example.weather.model;

public class Sys {

	private Integer type;
	private Integer id;
	private Float message;
	private String country;
	private Integer sunrise;
	private Integer sunset;
	/**
	 * @param type
	 * @param id
	 * @param message
	 * @param country
	 * @param sunrise
	 * @param sunset
	 */
	public Sys(Integer type, Integer id, Float message, String country, Integer sunrise, Integer sunset) {
		this.type = type;
		this.id = id;
		this.message = message;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	/**
	 * 
	 */
	public Sys() {
	}
	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the message
	 */
	public Float getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(Float message) {
		this.message = message;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the sunrise
	 */
	public Integer getSunrise() {
		return sunrise;
	}
	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	/**
	 * @return the sunset
	 */
	public Integer getSunset() {
		return sunset;
	}
	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", message=" + message + ", country=" + country + ", sunrise="
				+ sunrise + ", sunset=" + sunset + "]";
	}
	
	
}
