package com.bankoffairfield.customeraccountsmgmtapp.controller;

import com.bankoffairfield.customeraccountsmgmtapp.model.Account;
import com.bankoffairfield.customeraccountsmgmtapp.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
@Controller
@RequestMapping(value = {"/cadman/account"})
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = {"/list"})
    public ModelAndView listAccounts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accounts", accountService.getAccounts());
        modelAndView.setViewName("account/list");
        return modelAndView;
    }

    @GetMapping(value = {"/accounts/new"})
    public String addCustomer(Model model) {
        model.addAttribute("account", new Account());
        return "account/new";
    }

    @PostMapping(value = {"/accounts/new"})
    public String saveCustomer(Model model, @Valid @ModelAttribute("account") Account account,
                               BindingResult result) {
        model.addAttribute("account", account);
        if (result.hasErrors()) {
            return "account/new";
        }

        accountService.registerNewAccount(account);

        return "redirect:/cadman/account/list";

    }
}
