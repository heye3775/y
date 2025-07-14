import java.util.*;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    double totalMarks;

    Student(int rollNumber, String name, double totalMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.totalMarks, this.totalMarks);
    }

    @Override
    public String toString() {
        return rollNumber + " - " + name + " - " + totalMarks;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

class RollNumberComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNumber, s2.rollNumber);
    }
}

public class StudentDatabaseApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", 85.5));
        students.add(new Student(101, "Bob", 92.0));
        students.add(new Student(105, "Charlie", 75.0));
        students.add(new Student(102, "David", 85.5));
        students.add(new Student(104, "Eve", 90.0));

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nSorted by roll number (ascending):");
        students.sort(new RollNumberComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
