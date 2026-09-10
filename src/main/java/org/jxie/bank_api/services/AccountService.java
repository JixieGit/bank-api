package org.jxie.bank_api.services;

import org.jxie.bank_api.models.Account;
import org.jxie.bank_api.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service layer for handling busineess logic, enforcing rules
 */

@Service
public class AccountService {

    private final AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {

       this.accountRepository = accountRepository;
    }
    public List<Account> getAllAccounts() {
       return this.accountRepository.returnAccounts();
    }




}
