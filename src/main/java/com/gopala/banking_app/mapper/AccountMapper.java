package com.gopala.banking_app.mapper;

import com.gopala.banking_app.dto.AccountDto;
import com.gopala.banking_app.entity.Account;

public class AccountMapper {

    // Map AccountDto to Account entity
    public static Account mapToAccount(AccountDto accountDto) {
        if (accountDto == null) {
            return null; // Handle null input
        }

        Account account = new Account();
        if (accountDto.getId() != null) {
            account.setId(accountDto.getId()); // Set ID if provided
        }
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());

        return account;
    }

    // Map Account entity to AccountDto
    public static AccountDto mapToAccountDto(Account account) {
        if (account == null) {
            return null; // Handle null input
        }

        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
