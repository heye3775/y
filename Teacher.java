import java.io.File;
import java.util.Scanner;

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void display() {
        System.out.println("Name: " + name + ", Subject: " + subject);
    }
}

class Main {
  public static void main(String[] args) {
    Teacher[] t = new Teacher[3];

    t[0] = new Teacher("Alice", "Mathematics");
    t[1] = new Teacher("Bob", "Science");
    t[2] = new Teacher("Carol", "Mathematics");

    System.out.println("Teachers who teach Mathematics:");
    for(Teacher th : t)
      {
        if(th.subject == "Mathematics")
        {
          System.out.println(th.name + " " + th.subject);
        }
      }
  }
}