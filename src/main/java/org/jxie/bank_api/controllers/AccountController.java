package org.jxie.bank_api.controllers;


import org.jxie.bank_api.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class AccountController {


    @GetMapping("/accounts")
    public Account getAccount() {
        Account accounts = new Account("EE123213125", new BigDecimal(100));
        return accounts;

    }

}


