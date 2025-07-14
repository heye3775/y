interface Payment {
    void pay(double amount);
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card.");
    }
}
class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with PayPal.");
    }
}
class Main {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.pay(100.0);

        payment = new PayPal();
        payment.pay(50.0);
    }
}
