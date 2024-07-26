package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.observer.Subject;


public class AccountService extends Subject implements IAccountService {
    private IAccountDAO accountDAO;
    private Account lastChangedAccount;
    private Account createdAcc;

    public AccountService() {
        accountDAO = new AccountDAO();
    }

    public Account createAccount(long accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);
        accountDAO.saveAccount(account);
        createdAcc = account;
        lastChangedAccount = account;
        notifyWhenNewAccountCreated();
        return account;
    }

    public void deposit(long accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.deposit(amount);
        accountDAO.updateAccount(account);
        lastChangedAccount = account;
        donotify();
    }

    public Account getAccount(long accountNumber) {
        Account account = accountDAO.loadAccount(accountNumber);
        return account;
    }

    public Collection<Account> getAllAccounts() {
        return accountDAO.getAccounts();
    }

    public void withdraw(long accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.withdraw(amount);
        accountDAO.updateAccount(account);
        lastChangedAccount = account;
        donotify();
    }


    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
        Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
        Account toAccount = accountDAO.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        accountDAO.updateAccount(fromAccount);
        accountDAO.updateAccount(toAccount);
        lastChangedAccount = fromAccount;
        donotify();
    }

    @Override
    public Account getLastChangedAccount() {
        return lastChangedAccount;
    }

    @Override
    public Account getNewCreatedAccount() {
        return createdAcc;
    }
}
