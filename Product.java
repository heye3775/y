import java.io.File;
import java.util.Scanner;

public class Product {
  String name;
  int price;

  Product(String name, int price)
  {
    this.name = name;
    this.price = price;
  }
  void display()
  {
    System.out.println("Name : " + name);
    System.out.println("Price : " + price);
  }
}

class Main {
  public static void main(String[] args)
  {
    Product p[] = new Product[3];
    p[0] = new Product("Parker", 10);
    p[1] = new Product("Marker", 20);
    p[2] = new Product("pen", 30);

    for(int i = 0; i < 3; ++i)
      {
        System.out.println("Product : " + i + 1);
        p[i].display();
        System.out.println("\n");
      }
  }
}