/**
 * 
 */
package com.example.weather.util;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.weather.util.Utilities;

/**
 * @author arturo.leon
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilitiesTest {
	

	@Test
	public void convertKtoC_OK() {
		Float response = Utilities.convertKtoC(274.15f);
		assertEquals(new Float(1), response);
	}
	
	@Test
	public void convertKtoC_FAIL() {
		Float response = Utilities.convertKtoC(274.15f);
		assertNotEquals(new Float(5), response);
	}
	
	@Test
	public void convertKtoF_OK() {
		Float response = Utilities.convertKtoF(274.15f);
		assertEquals(new Float(33.8), response);
	}
	
	@Test
	public void convertKtoF_FAIL() {
		Float response = Utilities.convertKtoF(274.15f);
		assertNotEquals(new Float(5), response);
	}

}
