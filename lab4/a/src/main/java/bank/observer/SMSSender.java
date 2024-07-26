package bank.observer;

import bank.domain.Account;
import bank.service.IAccountService;

public class SMSSender extends Observer {

    public SMSSender(IAccountService accountService) {
        super(accountService);
    }

    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        sendSms(account);
    }

    void sendSms(Account account) {
        System.out.println("SMS: Sending SMS to " + account.getAccountnumber());
    }
}
