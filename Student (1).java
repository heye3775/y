import java.io.File;
import java.util.Scanner;

class Student {
    String name;
    int marks;
  
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Main {
  public static void main(String[] args)
  {
    Student[] s = new Student[5];
    
    s[0] = new Student("Alice", 85);
    s[1] = new Student("Bob", 78);
    s[2] = new Student("Charlie", 92);
    s[3] = new Student("Diana", 88);
    s[4] = new Student("Ethan", 75);

    int totalMarks = 0;
    for(Student st : s)
      {
        totalMarks += st.marks;
      }
    System.out.println("Average : " + totalMarks / 5);
  }
}