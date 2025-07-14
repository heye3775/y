import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Book {
    String title;
    String author;
    static int bookCount = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }
    static int getBookCount() 
    {
        return bookCount;
    }
    void display() 
    {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("Pride and Prejudice", "Jane Austen");

        b1.display();
        b2.display();
        b3.display();

        System.out.println("Total books created: " + Book.getBookCount());
        
    }
}