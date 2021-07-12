package com.bankoffairfield.customeraccountsmgmtapp.service;

import com.bankoffairfield.customeraccountsmgmtapp.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    void registerNewAccount(Account account);
}
