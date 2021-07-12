package com.bankoffairfield.customeraccountsmgmtapp.repository;

import com.bankoffairfield.customeraccountsmgmtapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
