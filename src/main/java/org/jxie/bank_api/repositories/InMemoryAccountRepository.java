package org.jxie.bank_api.repositories;

import org.jxie.bank_api.models.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class InMemoryAccountRepository implements AccountRepository {

    public final ArrayList<Account> account;

    public InMemoryAccountRepository() {

        this.account = new ArrayList<>();
    }

//    public String generateRandomAccountNumber() {
//
//
//    }

    public void createAccountsAddToList() {
        Account firstAccount = new Account("EE770702115421", new BigDecimal(1000));
        Account secondAccount = new Account("EE77446846548", new BigDecimal(300));
        Account thirdAccount = new Account("EE7711845181547", new BigDecimal(400));
        Account fourthAccount = new Account("EE775789484945", new BigDecimal(650));

        Collections.addAll(this.account, firstAccount,secondAccount,thirdAccount,fourthAccount);
    }

    public List<Account> returnAccounts() {
        createAccountsAddToList();

        return this.account;
    }


    public Account findAccount(String accountNumber) {

        return this.account.get(0);
    }
}
