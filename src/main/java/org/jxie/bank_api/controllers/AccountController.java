package org.jxie.bank_api.controllers;


import org.jxie.bank_api.models.Account;
import org.jxie.bank_api.repositories.InMemoryAccountRepository;
import org.jxie.bank_api.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("")
public class AccountController {

    public AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/accounts")
    public List<Account> getAccount() {

       return this.accountService.getAllAccounts();

    }

}


