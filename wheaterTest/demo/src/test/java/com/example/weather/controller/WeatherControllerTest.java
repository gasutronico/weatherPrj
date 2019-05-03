package com.example.weather.controller;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.weather.model.CityWeather;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:application.yml")
public class WeatherControllerTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	WeatherController controller;
	
	@Rule
    public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().port(8089).httpsPort(8443));

	@LocalServerPort
	private int port;

	@Test
	public void testGetWeather() {
		CityWeather cityWeather = new CityWeather();
		cityWeather.setCityId("12345");
		assertEquals("getWeatherByCityId", controller.sendForm(cityWeather));
	}

	@Test
	public void testGetWeatherByCityId_200(){
		stubFor(get(urlPathEqualTo("/data/2.5/weather"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-Type", APPLICATION_JSON_VALUE)
                        .withBodyFile("json/weatherResponse.json")));
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"http://localhost:"+port+"/weatherByCityId?cityId=2643743",String.class);
		
		assertThat("Verify Response Body", ((String) response.getBody()).contains("Hong Kong"));
        assertThat("Verify Status Code", response.getStatusCode().equals(HttpStatus.OK));
 	}
	
	@Test
	public void testGetWeatherByCityId_404(){
		stubFor(get(urlPathEqualTo("/data/2.5/weather"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.NOT_FOUND.value())
                        .withHeader("Content-Type", APPLICATION_JSON_VALUE)
                        .withBody("404 Error")
                 ));
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"http://localhost:"+port+"/weatherByCityId?cityId=2643743",String.class);
		
		assertThat("Verify Response Body", ((String) response.getBody()).contains("Error"));
        assertThat("Verify Status Code", response.getStatusCode().equals(HttpStatus.OK));
 	}
	
	@Test
	public void testGetWeatherByCityId_500(){
		stubFor(get(urlPathEqualTo("/data/2.5/weather"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                        .withHeader("Content-Type", APPLICATION_JSON_VALUE)
                        .withBody("500 Error")
                 ));
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"http://localhost:"+port+"/weatherByCityId?cityId=2643743",String.class);
		
		assertThat("Verify Response Body", ((String) response.getBody()).contains("Error"));
        assertThat("Verify Status Code", response.getStatusCode().equals(HttpStatus.OK));
 	}
	
}
