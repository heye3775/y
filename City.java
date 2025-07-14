import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    void display() {
        System.out.println(name + " - Population: " + population);
    }
}
class Main {
  public static void main(String[] args) {
    City[] cities = {
        new City("New York", 8419000),
        new City("Los Angeles", 3980000),
        new City("Chicago", 2716000),
        new City("Houston", 2328000),
        new City("Phoenix", 1690000)
    };

    Arrays.sort(cities, (c1, c2) -> Integer.compare(c1.population, c2.population));

    for(City c : cities)
      {
        c.display();
      }
  }
}