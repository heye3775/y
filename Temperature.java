import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class TemperatureConverter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

class Main {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        System.out.println(celsius + "°C = " + TemperatureConverter.celsiusToFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F = " + TemperatureConverter.fahrenheitToCelsius(fahrenheit) + "°C");
    }
}