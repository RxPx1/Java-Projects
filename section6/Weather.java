package section6;

public class Weather {
	
	

	public static void main(String[] args) {
		double[] celsius = {12.50, 14.50, 17.00, 21.00, 23.00, 18.50, 21.00};
		double[] fahrenheit = celsiusToFahrenheit(celsius);
		
		printTemperatures(celsius, "Celsius");
		printTemperatures(fahrenheit, "Fahrenheit");

	}
	
	public static double[] celsiusToFahrenheit(double[] celsius) {
		double[] fahrenheit = new double[celsius.length];
		for (int i  = 0; i < celsius.length; i++) {
			fahrenheit[i] = (celsius[i]/5 * 9) + 32;
		}
		return fahrenheit;
	}
		
		
	public static void printTemperatures(double[] temp, String type) {
		System.out.println(type + " ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(String.format("%.2f", temp[i]) + " ");
		}
			System.out.println("\n");
		
		
	}

}
