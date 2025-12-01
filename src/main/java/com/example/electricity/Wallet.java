package com.example.electricity;

import java.math.BigDecimal;
import java.util.List;

public class Wallet {
    private BigDecimal balance;
    private Customer customer;
    private List<Transaction> transaction;

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Transaction> getTransaction() { return transaction; }
    public void setTransaction(List<Transaction> transaction) { this.transaction = transaction; }
}
