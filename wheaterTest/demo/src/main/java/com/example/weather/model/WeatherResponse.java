/**
 * 
 */
package com.example.weather.model;

import java.util.Arrays;

/**
 * @author Arturo
 *
 */
public class WeatherResponse {

    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer id;
    private String name;
    private Integer cod;
    private String statusCode;
	/**
	 * @param coord
	 * @param weather
	 * @param base
	 * @param main
	 * @param visibility
	 * @param wind
	 * @param clouds
	 * @param dt
	 * @param sys
	 * @param id
	 * @param name
	 * @param cod
	 */
	public WeatherResponse(Coord coord, Weather[] weather, String base, Main main, Integer visibility, Wind wind,
			Clouds clouds, Integer dt, Sys sys, Integer id, String name, Integer cod) {
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	/**
	 * 
	 */
	public WeatherResponse() {
	}
	/**
	 * @return the coord
	 */
	public Coord getCoord() {
		return coord;
	}
	/**
	 * @param coord the coord to set
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	/**
	 * @return the weather
	 */
	public Weather[] getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	/**
	 * @return the base
	 */
	public String getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(String base) {
		this.base = base;
	}
	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	/**
	 * @return the visibility
	 */
	public Integer getVisibility() {
		return visibility;
	}
	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}
	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}
	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	/**
	 * @return the dt
	 */
	public Integer getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}
	/**
	 * @param sys the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cod
	 */
	public Integer getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	@Override
	public String toString() {
		return "WeatherResponse [coord=" + coord + ", weather=" + Arrays.toString(weather) + ", base=" + base
				+ ", main=" + main + ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt="
				+ dt + ", sys=" + sys + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
    
    
}
