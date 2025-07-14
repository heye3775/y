import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int[] marks;
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    char calculateGrade() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double avg = (double) total / marks.length;

        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
    void display() {
        System.out.println(name + "'s grade: " + calculateGrade());
    }
}

class Main {
    public static void main(String[] args)
    {
        Student[] s = {
            new Student("Alice", new int[]{85, 92, 78}),
            new Student("Bob", new int[]{70, 65, 80}),
            new Student("Charlie", new int[]{90, 88, 95}),
            new Student("Diana", new int[]{55, 60, 58}),
            new Student("Ethan", new int[]{75, 80, 72})
        };

        for (Student st : s) {
            st.display();
        }
    }
}