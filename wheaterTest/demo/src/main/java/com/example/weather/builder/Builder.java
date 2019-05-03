package com.example.weather.builder;

import com.example.weather.model.CityWeather;
import com.example.weather.model.WeatherResponse;


public interface Builder {

	CityWeather buildCityWeatherResponse(CityWeather cityWeather, WeatherResponse weatherResponse);

}