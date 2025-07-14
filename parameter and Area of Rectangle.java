import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int w = scanner.nextInt();
    System.out.println("Parameter of the Rectangle : " + 2 * (l + w));
    System.out.println("Area of the Rectangle : " + l * w);
  }
}