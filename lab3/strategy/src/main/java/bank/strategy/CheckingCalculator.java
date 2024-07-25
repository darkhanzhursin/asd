package bank.strategy;

import bank.domain.Account;

public class CheckingCalculator implements InterestCalculator {
    @Override
    public double calculate(Account account) {
        double balance = account.getBalance();
        if (balance < 1000) return balance * (1.5 / 100);
        return balance * (2.5 / 100);
    }
}
