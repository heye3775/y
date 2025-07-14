import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + price;
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.0));
        products.add(new Product(2, "Phone", 700.0));
        products.add(new Product(3, "Tablet", 400.0));
        products.add(new Product(4, "Monitor", 250.0));

        Collections.sort(products);
        System.out.println("Sorted by price:");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
