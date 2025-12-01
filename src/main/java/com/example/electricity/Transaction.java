package com.example.electricity;

import java.math.BigDecimal;
import java.util.List;

public class Transaction {
    private Customer customer;
    private List<Connection> connection;
    private BigDecimal amount;

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Connection> getConnection() { return connection; }
    public void setConnection(List<Connection> connection) { this.connection = connection; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
