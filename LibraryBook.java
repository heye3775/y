import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class LibraryBook {
    String title;
    String author;
    boolean borrowed;

    LibraryBook(String title, String author, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Main {
    public static void main(String[] args)
    {
        LibraryBook[] b = 
        {
            new LibraryBook("1984", "George Orwell", false),
            new LibraryBook("To Kill a Mockingbird", "Harper Lee", true),
            new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", false),
            new LibraryBook("Pride and Prejudice", "Jane Austen", true),
            new LibraryBook("Moby Dick", "Herman Melville", false)
        };

        for (LibraryBook bk : b) {
            if (!bk.borrowed) {
                bk.display();
            }
        }
    }
}