package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
	
	private Float temp;
	private Integer pressure;
	private Integer humidity;
	@JsonProperty("temp_min")
	private Float tempMin;
	@JsonProperty("temp_max")
	private Float tempMax;
	
	/**
	 * @return the tempMin
	 */
	public Float getTempMin() {
		return tempMin;
	}
	/**
	 * @param tempMin the tempMin to set
	 */
	public void setTempMin(Float tempMin) {
		this.tempMin = tempMin;
	}
	/**
	 * @return the tempMax
	 */
	public Float getTempMax() {
		return tempMax;
	}
	/**
	 * @param tempMax the tempMax to set
	 */
	public void setTempMax(Float tempMax) {
		this.tempMax = tempMax;
	}
	/**
	 * 
	 */
	public Main() {
	}
	/**
	 * @return the temp
	 */
	public Float getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(Float temp) {
		this.temp = temp;
	}
	/**
	 * @return the pressure
	 */
	public Integer getPressure() {
		return pressure;
	}
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	/**
	 * @return the humidity
	 */
	public Integer getHumidity() {
		return humidity;
	}
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

}
