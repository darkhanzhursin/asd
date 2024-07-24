package bank.util;

import bank.domain.Account;
import bank.service.IAccountService;

public class DepositCommand implements Command {

    Account account;
    double amount;
    IAccountService accountService;

    public DepositCommand(Account account, double amount, IAccountService accountService) {
        this.account = account;
        this.amount = amount;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
       accountService.deposit(account.getAccountnumber(), amount);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(account.getAccountnumber(), amount);
    }
}
