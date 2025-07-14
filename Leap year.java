import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a year : ");
    int a = scanner.nextInt();
    if(a % 4 == 0) System.out.println("Leap year");
    else System.out.println("Not leap year");
  }
}