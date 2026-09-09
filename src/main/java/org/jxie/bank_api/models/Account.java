package org.jxie.bank_api.models;

import java.math.BigDecimal;


public class Account {

    private String accountNumber;
    private BigDecimal balance;

    public Account(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public BigDecimal getBalance() {

        return this.balance;

    }
    public void addBalance(BigDecimal amount) {

        this.balance = this.balance.add(amount);

    }
    public void reduceBalance(BigDecimal amount) {

        this.balance = this.balance.subtract(amount);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

}
