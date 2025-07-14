import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = scanner.nextInt();
    if(n % 2 == 1) System.out.println("Odd");
    else System.out.println("Even");
  }
}