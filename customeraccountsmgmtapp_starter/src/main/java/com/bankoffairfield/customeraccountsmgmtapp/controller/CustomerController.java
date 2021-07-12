package com.bankoffairfield.customeraccountsmgmtapp.controller;

import com.bankoffairfield.customeraccountsmgmtapp.model.Customer;
import com.bankoffairfield.customeraccountsmgmtapp.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = {"/cadman/customer"})
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = {"/list"})
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", customerService.getCustomers());
        modelAndView.setViewName("customer/list");
        return modelAndView;
    }

    @GetMapping(value = {"/customers/new"})
    public String addCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/new";
    }

    @PostMapping(value = {"/customers/new"})
    public String saveCustomer(Model model, @Valid @ModelAttribute("customer") Customer customer,
                               BindingResult result) {
        model.addAttribute("customer", customer);
        if (result.hasErrors()) {
            return "customer/new";
        }

        customerService.registerNewCustomer(customer);

        return "redirect:/cadman/customer/list";

    }


}
