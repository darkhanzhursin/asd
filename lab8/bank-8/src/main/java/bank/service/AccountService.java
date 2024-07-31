package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.dto.AccountAdapter;
import bank.dto.AccountDTO;
import bank.proxy.LoggingProxy;
import bank.proxy.StopWatchProxy;


public class AccountService implements IAccountService {
    private IAccountDAO accountDAO = new AccountDAO();


//	public AccountService(){
//		accountDAO=new AccountDAO();
//	}

    ClassLoader classLoader = IAccountDAO.class.getClassLoader();
    IAccountDAO loggingProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,
            new Class[]{IAccountDAO.class}, new LoggingProxy(accountDAO));

    IAccountDAO stopwatchProxy = (IAccountDAO) Proxy.newProxyInstance(classLoader,
            new Class[]{IAccountDAO.class}, new StopWatchProxy(loggingProxy));

    public Account createAccount(long accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);
        stopwatchProxy.saveAccount(account);
        return account;
    }

    public void deposit(long accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        account.deposit(amount);
        stopwatchProxy.updateAccount(account);
    }

    public AccountDTO getAccount(long accountNumber) {
        Account account = stopwatchProxy.loadAccount(accountNumber);
        return AccountAdapter.mapToAccountDTO(account);
    }

    public Collection<AccountDTO> getAllAccounts() {
        Collection<Account> accounts = stopwatchProxy.getAccounts();
        return AccountAdapter.mapToAccountDTOList(accounts);
    }

    public void withdraw(long accountNumber, double amount) {
        Account account = stopwatchProxy.loadAccount(accountNumber);
        account.withdraw(amount);
        accountDAO.updateAccount(account);
    }


    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
        Account fromAccount = stopwatchProxy.loadAccount(fromAccountNumber);
        Account toAccount = stopwatchProxy.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        stopwatchProxy.updateAccount(fromAccount);
        stopwatchProxy.updateAccount(toAccount);
    }

}
