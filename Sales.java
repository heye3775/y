import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class SalesRecord {
    String productName;
    int unitsSold;
    double unitPrice;
    SalesRecord(String productName, int unitsSold, double unitPrice) {
        this.productName = productName;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
    }
    double totalRevenue() 
    {
        return unitsSold * unitPrice;
    }
    void display() 
    {
        System.out.println("Product: " + productName + ", Revenue: " + totalRevenue());
    }
}

class Main {
    public static void main(String[] args) {
        SalesRecord[] records = {
            new SalesRecord("Laptop", 50, 750.0),
            new SalesRecord("Phone", 120, 500.0),
            new SalesRecord("Tablet", 70, 300.0),
            new SalesRecord("Monitor", 40, 200.0),
            new SalesRecord("Printer", 30, 150.0)
        };

        SalesRecord topProduct = records[0];
        for (SalesRecord record : records) {
            if (record.totalRevenue() > topProduct.totalRevenue()) {
                topProduct = record;
            }
        }

        System.out.println("Highest grossing product:");
        topProduct.display();
    }
}