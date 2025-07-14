import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class BankAccount {
    String accountNumber;
    String holderName;
    double balance;
    
    BankAccount(String accountNumber, String holderName, double balance) 
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance.");
        }
    }

    void display() 
    {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args)
    {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount("A001", "Alice", 1000);
        accounts[1] = new BankAccount("B002", "Bob", 1500);
        accounts[2] = new BankAccount("C003", "Charlie", 2000);
        
        accounts[0].deposit(500);
        accounts[1].withdraw(200);
        accounts[2].withdraw(2500);
        accounts[2].deposit(300);

        for (BankAccount acc : accounts) {
            acc.display();
        }
    }
}