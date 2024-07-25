package bank.strategy;

import bank.domain.Account;

public interface InterestCalculator {
    double calculate(Account account);
}
