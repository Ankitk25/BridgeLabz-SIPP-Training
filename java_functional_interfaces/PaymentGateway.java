
interface PaymentProcessor {
    void process(double amount);
    default void refund(double amount) {
        System.out.println("Refunded: " + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed " + amount + " via PayPal");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.process(1000);
        paypal.refund(500);
    }
}
