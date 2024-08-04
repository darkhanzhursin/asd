package bank.factory;

import bank.integration.EmailSender;
import bank.integration.IEmail;

public class ProductionEmailFactory implements EmailFactory {
    @Override
    public IEmail getEmailService() {
        return EmailSender.getInstance();
    }
}
