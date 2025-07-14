import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter distance in miles : ");
    int a = scanner.nextInt();
    System.out.println("a miles is equal to " + a * 1.6 + " kilometers");
  }
}