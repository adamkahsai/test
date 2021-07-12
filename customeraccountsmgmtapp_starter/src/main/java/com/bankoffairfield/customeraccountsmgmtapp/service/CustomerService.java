package com.bankoffairfield.customeraccountsmgmtapp.service;

import com.bankoffairfield.customeraccountsmgmtapp.model.Customer;

import java.util.List;

public interface CustomerService {

    public abstract List<Customer> getCustomers();

    void registerNewCustomer(Customer customer);
}
