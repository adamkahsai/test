package com.bankoffairfield.customeraccountsmgmtapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/cadman"})
public class HomepageController {

    @GetMapping(value = {"/", "/home"})
    public String home() {
        return "home/index";
    }

}
