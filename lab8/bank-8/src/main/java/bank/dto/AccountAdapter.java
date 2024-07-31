package bank.dto;

import bank.domain.Account;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AccountAdapter {
    public static Account mapToAccount(AccountDTO account) {
        Account mappedAccount = new Account(account.getAccountnumber());
        mappedAccount.setCustomer(account.getCustomer());
        return mappedAccount;
    }

    public static AccountDTO mapToAccountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountnumber(account.getAccountnumber());
        accountDTO.setCustomer(account.getCustomer());
        accountDTO.setEntryList(account.getEntryList());
        accountDTO.setBalance(account.getBalance());
        return accountDTO;
    }

    public static List<AccountDTO> mapToAccountDTOList(Collection<Account> accountList) {
        return accountList.stream().map(AccountAdapter::mapToAccountDTO).collect(Collectors.toList());
    }
}
