import java.io.File;
import java.util.Scanner;

public class Pen {
  public String brand;
  public String color;

  Pen(String brand, String color)
  {
    this.brand = brand;
    this.color = color;
  }

  void write()
  {
    System.out.println("Writing with the " + color + " " + brand + ".");
  }
}

class Main {
  public static void main(String[] args)
  {
    Pen p = new Pen("Parker", "Blue");
    p.write();
  }
}