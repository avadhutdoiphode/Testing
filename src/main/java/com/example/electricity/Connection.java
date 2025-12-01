package com.example.electricity;

import java.math.BigInteger;

public class Connection {
    private BigInteger consumerNumber;
    private int billingUnit;
    private String type;
    private String name;
    private String home;

    public BigInteger getConsumerNumber() { return consumerNumber; }
    public void setConsumerNumber(BigInteger consumerNumber) { this.consumerNumber = consumerNumber; }

    public int getBillingUnit() { return billingUnit; }
    public void setBillingUnit(int billingUnit) { this.billingUnit = billingUnit; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
