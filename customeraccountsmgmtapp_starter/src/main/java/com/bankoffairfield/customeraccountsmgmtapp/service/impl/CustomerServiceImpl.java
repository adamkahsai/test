package com.bankoffairfield.customeraccountsmgmtapp.service.impl;

import com.bankoffairfield.customeraccountsmgmtapp.model.Customer;
import com.bankoffairfield.customeraccountsmgmtapp.repository.CustomerRepository;
import com.bankoffairfield.customeraccountsmgmtapp.service.CustomerService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll(Sort.by("name"));
    }

    @Override
    public void registerNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }

}
