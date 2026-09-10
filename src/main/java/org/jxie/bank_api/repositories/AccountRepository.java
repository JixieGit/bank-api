package org.jxie.bank_api.repositories;

import org.jxie.bank_api.models.Account;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface AccountRepository {

     List<Account> returnAccounts();
     Account findAccount(String accountNumber);

}
