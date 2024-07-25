package with.templatemethod;

public class Paypal extends PaymentProcessor {

    String address;

    public Paypal(String address) {
        this.address = address;
    }

    @Override
    void processPayment(double amount, String currency, Customer customer) {
        double dollarAmount = convertToDollar(amount, currency);
        if (validate()) {
            // logic to perform paypal payment
            System.out.println("Perform payment with paypal address "+this.address+" and amount $"+dollarAmount);

            // logic to notify customer
            System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about " +
                    "paypal payment to address "+this.address);
        }
    }

    @Override
    boolean validate() {
        // logic to validate paypal address
        System.out.println("Validate paypal address " + this.address);
        return true;
    }
}
