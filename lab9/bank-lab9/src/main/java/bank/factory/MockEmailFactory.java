package bank.factory;

import bank.integration.IEmail;
import bank.integration.MockEmailSender;

public class MockEmailFactory implements EmailFactory {
    @Override
    public IEmail getEmailService() {
        return new MockEmailSender();
    }
}
