import java.io.File;
import java.util.Scanner;

public class Student {
  private String name;
  private String class_name;
  private int id;

  public Student(String name, String class_name, int id)
  {
    this.name = name;
    this.class_name = class_name;
    this.id = id;
  }
  public void display()
  {
    System.out.println("Name : " + name);
    System.out.println("Class : " + class_name);
    System.out.println("Id : " + id);
  }
}

class Main {
  public static void main(String[] args)
  {
    Student st = new Student("Alice", "3rd", 10001);
    st.display();
  }
}