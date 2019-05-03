package com.example.weather.model;

public class Wind {

	private Float speed;
	private Integer deg;
	/**
	 * @param speed
	 * @param deg
	 */
	public Wind(Float speed, Integer deg) {
		this.speed = speed;
		this.deg = deg;
	}
	/**
	 * 
	 */
	public Wind() {
	}
	/**
	 * @return the speed
	 */
	public Float getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Float speed) {
		this.speed = speed;
	}
	/**
	 * @return the deg
	 */
	public Integer getDeg() {
		return deg;
	}
	/**
	 * @param deg the deg to set
	 */
	public void setDeg(Integer deg) {
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	};
	
	
}
