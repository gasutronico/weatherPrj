package com.example.weather.model;

public class Clouds {
	
	private Integer all;

	/**
	 * @param all
	 */
	public Clouds(Integer all) {
		this.all = all;
	}

	/**
	 * 
	 */
	public Clouds() {
	}

	/**
	 * @return the all
	 */
	public Integer getAll() {
		return all;
	}

	/**
	 * @param all the all to set
	 */
	public void setAll(Integer all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}
	
	

}
