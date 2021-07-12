package com.bankoffairfield.customeraccountsmgmtapp.service.impl;

import com.bankoffairfield.customeraccountsmgmtapp.model.Account;
import com.bankoffairfield.customeraccountsmgmtapp.repository.AccountRepository;
import com.bankoffairfield.customeraccountsmgmtapp.repository.CustomerRepository;
import com.bankoffairfield.customeraccountsmgmtapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void registerNewAccount(Account account) {
        accountRepository.save(account);
    }
}
