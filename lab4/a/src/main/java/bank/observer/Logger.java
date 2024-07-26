package bank.observer;

import bank.domain.Account;
import bank.service.IAccountService;

public class Logger extends Observer {

    public Logger(IAccountService accountService) {
        super(accountService);
    }

    @Override
    public void update() {
        Account account = accountService.getLastChangedAccount();
        log(account);
    }

    public void log(Account account) {
        System.out.println("Log: " + account.getAccountnumber());
    }
}
