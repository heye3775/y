interface DiscountStrategy {
    double applyDiscount(double price);
}

class RegularCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.95;
    }
}

class PremiumCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.90;
    }
}

class PlatinumCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}

class Customer {
    String name;
    DiscountStrategy strategy;

    Customer(String name, DiscountStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    double getFinalPrice(double price) {
        return strategy.applyDiscount(price);
    }
}

public class DiscountEngine {
    public static void main(String[] args) {
        Customer regular = new Customer("Alice", new RegularCustomerDiscount());
        Customer premium = new Customer("Bob", new PremiumCustomerDiscount());
        Customer platinum = new Customer("Carol", new PlatinumCustomerDiscount());

        double basePrice = 1000.0;

        System.out.println(regular.name + " pays: $" + regular.getFinalPrice(basePrice));
        System.out.println(premium.name + " pays: $" + premium.getFinalPrice(basePrice));
        System.out.println(platinum.name + " pays: $" + platinum.getFinalPrice(basePrice));
    }
}
