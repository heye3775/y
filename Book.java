import java.io.File;
import java.util.Scanner;

public class Book {
  public String title;
  public String author;
  public int price;

  public Book(String title, String author, int price)
  {
    this.title = title;
    this.author = author;
    this.price = price;
  }
  public void display()
  {
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Price : " + price);
  }
}

class Main {
  public static void main(String[] args)
  {
    Book b = new Book("The lost city of z", "unknown", 100);
    b.display();
  }
}