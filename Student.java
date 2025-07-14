import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int id;
    static int nextId = 1000;

    Student(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}