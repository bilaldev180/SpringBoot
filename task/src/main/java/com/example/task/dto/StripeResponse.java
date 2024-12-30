package com.example.task.dto;

public class StripeResponse {
    private  String stripeCurrency = "AED";
    private  int stripeTid = 20;
    private double stripeAmount = 1000.0/100;

    public String getStripeCurrency() {
        return stripeCurrency;
    }

    public void setStripeCurrency(String stripeCurrency) {
        this.stripeCurrency = stripeCurrency;
    }

    public int getStripeTid() {
        return stripeTid;
    }

    public void setStripeTid(int stripeTid) {
        this.stripeTid = stripeTid;
    }

    public double getStripeAmount() {
        return stripeAmount;
    }

    public void setStripeAmount(double stripeAmount) {
        this.stripeAmount = stripeAmount;
    }
}
