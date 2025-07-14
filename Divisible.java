import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = scanner.nextInt();
    if(a % 5 == 0) System.out.println("Divisible");
    else System.out.println("Not divisible");
  }
}