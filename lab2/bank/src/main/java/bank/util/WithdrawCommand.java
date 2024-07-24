package bank.util;

import bank.domain.Account;
import bank.service.AccountService;
import bank.service.IAccountService;

public class WithdrawCommand implements Command {

    Account account;
    double amount;
    IAccountService accountService;

    public WithdrawCommand(Account account, double amount, IAccountService accountService) {
        this.account = account;
        this.amount = amount;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.withdraw(account.getAccountnumber(), amount);
    }

    @Override
    public void unExecute() {
        accountService.deposit(account.getAccountnumber(), amount);
    }
}
