package com.example.task.model;

public class paymentResponse {
    private String CURRENCY;
    private int TID ;
    private double AMOUNT;

    public paymentResponse(String CURRENCY, int TID, double AMOUNT) {
        this.CURRENCY = CURRENCY;
        this.TID = TID;
        this.AMOUNT = AMOUNT;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public int getTID() {
        return TID;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public void setAMOUNT(int AMOUNT) {
        this.AMOUNT = AMOUNT;
    }
}
