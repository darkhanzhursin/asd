package bank.integration;

public class MockEmailSender implements IEmail {
    @Override
    public void send(String msg) {
        System.out.println("Sending Mock email: " + msg);
    }
}
