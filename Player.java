import java.io.File;
import java.util.Scanner;

class Player {
  String name;
  int score;

  Player(String name, int score)
  {
    this.name = name;
    this.score = score;
  }
  void updateScore(int newScore)
  {
    score = newScore;
  }
  void display()
  {
    System.out.println("Name : " + name);
    System.out.println("Score : " + score);
  }
}

class Main {
  public static void main(String[] args)
  {
    Player p1 = new Player("Alice", 50);
    p1.display();

    p1.updateScore(75);
    System.out.println("After score update:");
    p1.display();
  }
}