package bank;

import java.util.Collection;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.domain.Customer;
import bank.service.AccountService;
import bank.service.IAccountService;
import bank.util.DepositCommand;
import bank.util.HistoryList;
import bank.util.WithdrawCommand;


public class Application {
	public static void main(String[] args) {
		IAccountService accountService = new AccountService();
		// create 2 accounts;
		Account account1 = accountService.createAccount(1263862, "Frank Brown");
		Account account2 = accountService.createAccount(4253892, "John Doe");
		//use account 1;
		HistoryList historyList = new HistoryList();
		DepositCommand deposit1 = new DepositCommand(account1, 240, accountService);
		deposit1.execute();
		historyList.addCommand(deposit1);

		WithdrawCommand withdraw1 = new WithdrawCommand(account1, 240, accountService);
		withdraw1.execute();
		historyList.addCommand(withdraw1);
		historyList.undo();
//		accountService.deposit(1263862, 240);
//		accountService.deposit(1263862, 529);
//		accountService.withdraw(1263862, 230);
//		//use account 2;
//		accountService.deposit(4253892, 12450);
//		accountService.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		// show balances

		Collection<Account> accountList = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountList) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


