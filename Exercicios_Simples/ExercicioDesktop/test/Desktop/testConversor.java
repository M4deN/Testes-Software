package Desktop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testConversor {

	@Test
	void testCelsiusToKelvin() {
		
		ConversorKelvin c1 = new ConversorKelvin();
		var res = c1.celsiusToKelvin(122.0);
		assertEquals(251.6, res, 0.01);
	}

	@Test
	void testKelvinToCelsius() {
		
		ConversorKelvin c1 = new ConversorKelvin();
		var res = c1.KelvinToCelsius(12.5);
		assertEquals(-260.65, res, 0.01);
	}
	
	@Test
	void testKelvinToFahrenheit() {
		
		ConversorKelvin c1 = new ConversorKelvin();
		var res = c1.KelvinToFahrenheit(10.4);
		assertEquals(-440.95, res, 0.01);
	}
	@Test
	void testFahrenheitToKelvin() {
		
		ConversorKelvin c1 = new ConversorKelvin();
		var res = c1.FahrenheitToKelvin(29.8);
		assertEquals(271.9278, res, 0.01);
	}
}

