package edu.mum.cs.cs425.wallyMarty.model;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    //	@NotNull
    @NotBlank(message = "# Customer Nummber is required, it cannot be null, empty or blank space")
    @NotEmpty
    @Pattern(regexp = "EP-([0-9]){7}", message = "# Customer number must be of 'C-' followed by 7 digits")
    private String customerNumber;


    //	@NotEmpty
    @NotBlank(message = "# Customer Name is required, it cannot be null, empty or blank space")
    @Column(nullable = false)
    private String name;


    private String contacPhonetNumber;

    @NotNull(message = "Date of Birth is required")
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;


    public Customer() {

    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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

    public String getContacPhonetNumber() {
        return contacPhonetNumber;
    }

    public void setContacPhonetNumber(String contacPhonetNumber) {
        this.contacPhonetNumber = contacPhonetNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
