package com.bankoffairfield.customeraccountsmgmtapp.repository;

import com.bankoffairfield.customeraccountsmgmtapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
