package com.example.weather.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weather.model.CityWeather;
import com.example.weather.model.WeatherResponse;
import com.example.weather.util.ConfiguratorProperties;
import com.example.weather.util.Utilities;

@Service
public class BuilderImpl implements Builder {

	@Autowired
	ConfiguratorProperties properties;

	@Override
	public CityWeather buildCityWeatherResponse(CityWeather cityWeather, WeatherResponse weatherResponse) {
		cityWeather.setDate(new SimpleDateFormat(properties.getStandardFormatDate()).format(new Date()));
		cityWeather.setWeatherDescription((weatherResponse.getWeather()[0]).getDescription());
		cityWeather.setTemperatureC(String.format(properties.getTwoDecimalFormat(), Utilities.convertKtoC(weatherResponse.getMain().getTemp())));
		cityWeather.setTemperatureF(String.format(properties.getTwoDecimalFormat(), Utilities.convertKtoF(weatherResponse.getMain().getTemp())));

		SimpleDateFormat sdf = new SimpleDateFormat(properties.getAmpmFormatDate());
		cityWeather.setSunriseTime(sdf.format(new Date(weatherResponse.getSys().getSunrise() * 1000L)));
		cityWeather.setSunsetTime(sdf.format(new Date(weatherResponse.getSys().getSunset() * 1000L)));
		cityWeather.setCityName(weatherResponse.getName());

		return cityWeather;		
	}

}
