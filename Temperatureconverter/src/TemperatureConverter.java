
public class TemperatureConverter {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double fahrenheit;

		double result =temperatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println(result);
	

	}

	private double convertFahrenheitToCelsius(double fahrenheit) {
		
		
		return (fahrenheit - 32) * 5/9;
	}
	
}
