package bank.observer;

import bank.domain.Account;
import bank.service.IAccountService;

public class EmailSender extends Observer {

    public EmailSender(IAccountService accountService) {
        super(accountService);
    }

    @Override
    public void update() {
        Account account = accountService.getNewCreatedAccount();
        sendEmail(account);
    }

    void sendEmail(Account account) {
        System.out.println("Email: New account created: " + account.getAccountnumber());
    }
}
