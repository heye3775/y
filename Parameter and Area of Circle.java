import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the radius : ");
    int r = scanner.nextInt();
    System.out.println("Parameter of the circle : " + 2 * 3.14 * r);
    System.out.println("Area of the circle : " + 3.14 * r * r);
  }
}