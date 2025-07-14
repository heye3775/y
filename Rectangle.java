import java.io.File;
import java.util.Scanner;

public class Rectangle {
  public int length;
  public int width;

  Rectangle(int length, int width)
  {
    this.length = length;
    this.width = width;
  }
  void getParameter()
  {
    System.out.println("Parameter : " + 2 * (length + width));
  }
  void getArea()
  {
    System.out.println("Area : " + length * width);
  }
}

class Main {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int w = scanner.nextInt();

    Rectangle r = new Rectangle(l, w);

    r.getParameter();
    r.getArea();
  }
}