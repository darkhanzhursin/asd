package with.templatemethod;

public class Application {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Frank Brown", "fbrown@gmail.com");
        PaymentProcessor mastercard = new Mastercard("1111 2222 3333 4444", "Frank Brown", "09/2026",112);
        mastercard.processPayment(125.75, "USD", customer1);

        System.out.println("------------------------------------");

        Customer customer2 = new Customer("John Doe", "jdoe@gmail.com");
        PaymentProcessor paypal = new Paypal("jdoe@gmail.com");
        paypal.processPayment(175000.0, "INR", customer2);
    }
}
