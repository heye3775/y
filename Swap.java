import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int temp = b;
    b = a;
    a = temp;
    System.out.println(a + " " + b);
  }
}