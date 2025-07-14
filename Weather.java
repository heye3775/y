import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class WeatherReport {
    String city;
    double temperature;
    int humidity;

    WeatherReport(String city, double temperature, int humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void display() {
        System.out.println("City: " + city + ", Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}


class Main {
    public static void main(String[] args) {
        WeatherReport[] reports = 
        {
            new WeatherReport("Delhi", 35.5, 65),
            new WeatherReport("Mumbai", 30.2, 80),
            new WeatherReport("Chennai", 33.0, 85),
            new WeatherReport("Kolkata", 31.5, 78),
            new WeatherReport("Bangalore", 28.0, 70)
        };
        WeatherReport mostHumid = reports[0];
        for (WeatherReport report : reports) 
        {
            if (report.humidity > mostHumid.humidity) 
            {
                mostHumid = report;
            }
        }
        System.out.println("Most humid city:");
        mostHumid.display();
    }
}