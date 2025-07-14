import java.io.File;
import java.util.Scanner;

class Book {
  String title;
  String author;

  Book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }
  void display()
  {
    System.out.println("Title : " + title + ", author : " + author);
  }
}

class Main {
  public static void main(String[] args)
  {
    Book[] b = new Book[5];
    b[0] = new Book("1984", "George Orwell");
    b[1] = new Book("To Kill a Mockingbird", "Harper Lee");
    b[2] = new Book("Unknown", "Unknown");
    b[3] = new Book("Pride and Prejudice", "Jane Austen");
    b[4] = new Book("Moby Dick", "Herman Melville");

    for(Book bk : b)
      {
        bk.display();
      }
  }
}