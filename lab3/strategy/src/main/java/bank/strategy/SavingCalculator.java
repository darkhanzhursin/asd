package bank.strategy;

import bank.domain.Account;

public class SavingCalculator implements InterestCalculator {

    @Override
    public double calculate(Account account) {
        double balance = account.getBalance();
        if (balance < 1000) return balance * 0.01;
        if (balance > 1000 && balance < 5000) return balance * 0.02;
        return balance * 0.04;
    }
}
