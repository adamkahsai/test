package com.bankoffairfield.customeraccountsmgmtapp.model;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    //	@NotNull
    @NotBlank(message = "# Account Nummber is required, it cannot be null, empty or blank space")
    @NotEmpty
    @Pattern(regexp = "([0-9]){3}-C-([0-9]){3}", message = "# Account number must be of '101-C-101' followed by 7 digits")
    private String accountNumber;


    //	@NotEmpty
    @NotBlank(message = "# Account Type is required, it cannot be null, empty or blank space")
    @Column(nullable = false)
    private String accountType;



    @NotNull(message = "Date of Birth is required")
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOpened;

    @NotNull(message = "* balance is required")
    @Digits(integer = 9, fraction = 2, message = "Balance must be a numeric, decimlal amount money 'xxx.xx'")
    @NumberFormat(pattern = "#,###.##")
    private double balance;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

