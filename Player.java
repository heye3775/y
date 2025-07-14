import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
class Player {
    String name;
    int individualScore;
    static int totalScore = 0;

    Player(String name) {
        this.name = name;
        this.individualScore = 0;
    }
    void addPoints(int points) {
        individualScore += points;
        totalScore += points;
    }
    void displayScore() {
        System.out.println("Player: " + name + ", Score: " + individualScore);
    }
    static void displayTotalScore() {
        System.out.println("Total Score: " + totalScore);
    }
}

class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        p1.addPoints(30);
        p2.addPoints(50);
        p1.addPoints(20);

        p1.displayScore();
        p2.displayScore();
        Player.displayTotalScore();
    }
}