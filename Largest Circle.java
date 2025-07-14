import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("Circle with radius: " + radius + ", Area: " + area());
    }
}

class Main {
    public static void main(String[] args)
    {
        Circle[] circles = {
            new Circle(3.5),
            new Circle(5.0),
            new Circle(2.8),
            new Circle(4.2),
            new Circle(6.1)
        };

        double largest = circles[0].radius;
        for(Circle c : circles)
            {
                if(c.area() > largest)
                {
                    largest = c.area();
                }
            }
        System.out.println(largest);
    }
}