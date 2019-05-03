/**
 * 
 */
package com.example.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.weather.model.CityWeather;
import com.example.weather.service.WeatherService;

/**
 * @author Arturo
 *
 */
@Controller
public class WeatherController {

	@Autowired
	WeatherService weatherServiceImpl;

	/**
	 * 
	 * @param cityWeather
	 * @return
	 */
	@GetMapping("/weather")
	public String sendForm(CityWeather cityWeather) {
		return "getWeatherByCityId";
	}

	/**
	 * 
	 * @param cityWeather
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/weatherByCityId")
	public String processForm(CityWeather cityWeather) {
		weatherServiceImpl.getWeatherByCityId(cityWeather);
		if (cityWeather.getCityName().contains("Error")) {
			return "showError";
		}else {
			return "showResult";
		}
	}

	

}
