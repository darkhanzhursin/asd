package with.templatemethod;

public class Visa extends PaymentProcessor {

    private String creditCardNumber;
    private String customerName;
    private String validDate;
    private int securityCode;

    public Visa(String creditCardNumber, String customerName, String validDate, int securityCode) {
        this.creditCardNumber = creditCardNumber;
        this.customerName = customerName;
        this.validDate = validDate;
        this.securityCode = securityCode;
    }

    @Override
    void processPayment(double amount, String currency, Customer customer) {
        double dollarAmount = convertToDollar(amount, currency);
        if (validate()) {
            // logic to perform payment visa card
            System.out.println("Perform payment with visa card with card number " + this.creditCardNumber
                    + " and amount $" + dollarAmount);

            // logic to notify customer
            System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                    + " about visa credit card payment with card number " + this.creditCardNumber);
        }
    }

    @Override
    boolean validate() {
        // logic to validate visa card
        System.out.println("Validate visa card with card number " + this.creditCardNumber);
        return true;
    }
}
