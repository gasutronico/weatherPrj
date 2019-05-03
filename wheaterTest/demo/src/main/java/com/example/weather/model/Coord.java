package com.example.weather.model;

public class Coord {
	
	private Float lon;
	private Float lat;
	/**
	 * @param lon
	 * @param lat
	 */
	public Coord(Float lon, Float lat) {
		this.lon = lon;
		this.lat = lat;
	}
	/**
	 * 
	 */
	public Coord() {
	}
	/**
	 * @return the lon
	 */
	public Float getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Float lon) {
		this.lon = lon;
	}
	/**
	 * @return the lat
	 */
	public Float getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Float lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "Coord [lon=" + lon + ", lat=" + lat + "]";
	}
	
	

}
