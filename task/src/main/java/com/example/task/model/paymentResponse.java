package com.example.task.model;

public class paymentResponse {
    private String currencyCode;
    private int transactionId ;
    private double transaction;

    public paymentResponse(String currencyCode, int transactionId, double transaction) {
        this.currencyCode = currencyCode;
        this.transactionId = transactionId;
        this.transaction = transaction;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getTransaction() {
        return transaction;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }
}
