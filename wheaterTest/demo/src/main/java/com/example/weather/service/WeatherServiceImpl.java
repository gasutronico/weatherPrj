package com.example.weather.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.weather.builder.Builder;
import com.example.weather.model.CityWeather;
import com.example.weather.model.WeatherResponse;
import com.example.weather.util.ConfiguratorProperties;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	private static final Logger log = LogManager.getLogger(WeatherServiceImpl.class);

	@Autowired
	ConfiguratorProperties properties;
	
	@Autowired
	Builder builder;

	@Override
	public void getWeatherByCityId(CityWeather cityWeather){
		try {
			RestTemplate restTemplate = new RestTemplate();
			WeatherResponse response = restTemplate.getForObject(
					properties.getPath() + cityWeather.getCityId() + "&APPID=" + properties.getAppid(), WeatherResponse.class);
			builder.buildCityWeatherResponse(cityWeather, response);
		}catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {
			if(HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
				log.error(properties.getError404(), httpClientOrServerExc);
				cityWeather.setCityName(properties.getError404());
			}else if(HttpStatus.INTERNAL_SERVER_ERROR.equals(httpClientOrServerExc.getStatusCode())) {
				log.error(properties.getError500(), httpClientOrServerExc);
				cityWeather.setCityName(properties.getError500());
			}
		}
	}

}
