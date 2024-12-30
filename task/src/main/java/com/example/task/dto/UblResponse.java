package com.example.task.dto;

public class UblResponse {
    private String ublCurrency = "Rupees";
    private int ublTid = 20;
    private double ublAmount = 100;

    public String getUblCurrency() {
        return ublCurrency;
    }

    public void setUblCurrency(String ublCurrency) {
        this.ublCurrency = ublCurrency;
    }

    public int getUblTid() {
        return ublTid;
    }

    public void setUblTid(int ublTid) {
        this.ublTid = ublTid;
    }

    public double getUblAmount() {
        return ublAmount;
    }

    public void setUblAmount(double ublAmount) {
        this.ublAmount = ublAmount;
    }
}
