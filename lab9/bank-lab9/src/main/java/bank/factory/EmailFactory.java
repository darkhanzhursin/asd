package bank.factory;

import bank.integration.IEmail;

public interface EmailFactory {
    IEmail getEmailService();
}
