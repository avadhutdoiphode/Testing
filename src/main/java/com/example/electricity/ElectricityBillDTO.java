package com.example.electricity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class ElectricityBillDTO {
    private Customer customer;
    private Connection connection;
    private Wallet wallet;
    private Transaction transaction;

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Connection getConnection() { return connection; }
    public void setConnection(Connection connection) { this.connection = connection; }

    public Wallet getWallet() { return wallet; }
    public void setWallet(Wallet wallet) { this.wallet = wallet; }

    public Transaction getTransaction() { return transaction; }
    public void setTransaction(Transaction transaction) { this.transaction = transaction; }
}
