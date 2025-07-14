import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter total marks : ");
    int a = scanner.nextInt();
    System.out.println("Enter obtain marks : ");
    int b = scanner.nextInt();
    int p = (b * 100) / a;
    if(p >= 90) System.out.println("Grade A");
    else if(p >= 80 && p <= 89) System.out.println("Grade B");
    else if(p >= 70 && p <= 79) System.out.println("Grade C");
    else if(p >= 60 && p <= 69) System.out.println("Grade D");
    else if(p >= 40 && p <= 59) System.out.println("Grade E");
    else System.out.println("Grade F");
  }
}