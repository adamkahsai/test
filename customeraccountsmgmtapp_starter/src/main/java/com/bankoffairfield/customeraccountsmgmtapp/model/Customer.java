package com.bankoffairfield.customeraccountsmgmtapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Column(nullable = false, unique = true)
    @NotNull(message = "Customer Number is required")
    @NotBlank(message = "Customer Number cannot be empty or blank spaces")
    private String customerNumber;
    @NotNull(message = "Customer Name is required")
    @NotBlank(message = "Customer Name cannot be empty or blank spaces")
    private String name;
    private String contactPhoneNumber;
    private String email;

    public Customer(Integer customerId, String customerNumber, String name, String contactPhoneNumber, String email) {
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.name = name;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
