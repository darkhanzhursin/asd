package with.templatemethod;

public abstract class PaymentProcessor {
    public double convertToDollar(double amount, String currency) {
        double dollarAmount = amount;

        if (currency.contentEquals("EUR")) { // European Euro
            dollarAmount = amount * 1.1;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        if (currency.contentEquals("INR")) { // Indian Rupee
            dollarAmount = amount * 0.014;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        return dollarAmount;
    }
    abstract void processPayment(double amount, String currency, Customer customer);
    abstract boolean validate();
}
