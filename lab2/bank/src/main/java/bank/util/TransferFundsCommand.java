package bank.util;

import bank.domain.Account;
import bank.service.IAccountService;

public class TransferFundsCommand implements Command {

    Account fromAccount;
    Account toAccount;
    double amount;
    String description;
    IAccountService accountService;

    public TransferFundsCommand(Account fromAccount, Account toAccount, double amount,
                                String description, IAccountService accountService) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.transferFunds(
                fromAccount.getAccountnumber(),
                toAccount.getAccountnumber(),
                amount,
                description
        );
    }

    @Override
    public void unExecute() {
        accountService.transferFunds(
                toAccount.getAccountnumber(),
                fromAccount.getAccountnumber(),
                amount, description
        );
    }
}
