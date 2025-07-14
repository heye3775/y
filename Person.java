class Person {
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo()
    {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

class Student extends Person {
    double grade;

    Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }
    @Override
    void displayInfo()
    {
        System.out.println("Name : " + name + ", Age : " + age + ", Grade : " + grade);
    }
}

class Main {
    public static void main(String[] args)
    {
        Person p = new Student("Alice", 19, 3.0);
        p.displayInfo();
    }
}