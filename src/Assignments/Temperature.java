package Assignments;

import java.util.Scanner;

public class Temperature {

    double convertedTemperature;
    public double convertUnit(double temperature){
        //Converting to Fahrenheit
        convertedTemperature = (1.8 * temperature) + 32;
        return convertedTemperature;
    }
    public double convertUnit(double temperature, double convertedTemperature){
        //Converting to Kelvin
        convertedTemperature = temperature + 273.15;
        return convertedTemperature;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        double temperature = scanner.nextDouble();

        Temperature temperature1 = new Temperature();
        System.out.println("Temperature in Fahrenheit is: " + temperature1.convertUnit(temperature) + "F");
        System.out.println("Temperature in Kelvin is: " + temperature1.convertUnit(temperature, temperature1.convertedTemperature) + "K");
    }
}
