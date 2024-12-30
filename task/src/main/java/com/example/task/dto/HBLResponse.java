package com.example.task.dto;

public class HBLResponse {
    private String hblCurrency = "$";
    private int hblTid = 20;
    private int hblAmount = 100;

    public String getHblCurrency() {
        return hblCurrency;
    }

    public void setHblCurrency(String hblCurrency) {
        this.hblCurrency = hblCurrency;
    }

    public int getHblTid() {
        return hblTid;
    }

    public void setHblTid(int hblTid) {
        this.hblTid = hblTid;
    }

    public int getHblAmount() {
        return hblAmount;
    }

    public void setHblAmount(int hblAmount) {
        this.hblAmount = hblAmount;
    }
}
