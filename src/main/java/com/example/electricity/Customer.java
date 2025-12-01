package com.example.electricity;

import java.math.BigInteger;
import java.util.List;

public class Customer {
    private String name;
    private BigInteger contact;
    private List<Connection> connection;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigInteger getContact() { return contact; }
    public void setContact(BigInteger contact) { this.contact = contact; }

    public List<Connection> getConnection() { return connection; }
    public void setConnection(List<Connection> connection) { this.connection = connection; }
}
