import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class BankAccount {
    double balance;
    static double interestRate = 0.05;

    BankAccount(double balance) {
        this.balance = balance;
    }
    static void setInterestRate(double rate) {
        interestRate = rate;
    }
    double calculateInterest() {
        return balance * interestRate;
    }
    void display() {
        System.out.println("Balance: " + balance + ", Interest: " + calculateInterest());
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1000);
        BankAccount a2 = new BankAccount(2000);

        a1.display();
        a2.display();

        BankAccount.setInterestRate(0.06);

        a1.display();
        a2.display();
    }
}