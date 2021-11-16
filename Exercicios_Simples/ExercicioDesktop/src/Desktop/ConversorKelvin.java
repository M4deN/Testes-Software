package Desktop;

public class ConversorKelvin {
	
	double celsiusToKelvin ( double c ){
	
		return (c * 9/5) + 32;
	}
	
	double KelvinToCelsius ( double k ){
		
		return k - 273.15;
	}
	
	double KelvinToFahrenheit ( double f ){
		
		return (f - 273.15) * 9/5 + 32;
	}
	
	double FahrenheitToKelvin ( double h ){
		
		return (h - 32) * 5/9 + 273.15;
	}
	
}
