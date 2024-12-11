package com.example.task.model;


public class PaypalResponse {
    private  String paypalCURRENCY = "$";
    private  int paypalTID = 30;
    private double paypalAMOUNT = 100;
    private  double dailyLIMIT = 900;

    public String getPaypalCURRENCY() {
        return paypalCURRENCY;
    }

    public void setPaypalCURRENCY(String paypalCURRENCY) {
        this.paypalCURRENCY = paypalCURRENCY;
    }

    public int getPaypalTID() {
        return paypalTID;
    }

    public void setPaypalTID(int paypalTID) {
        this.paypalTID = paypalTID;
    }

    public double getPaypalAMOUNT() {
        return paypalAMOUNT;
    }

    public void setPaypalAMOUNT(double paypalAMOUNT) {
        this.paypalAMOUNT = paypalAMOUNT;
    }

    public double getDailyLIMIT() {
        return dailyLIMIT;
    }

    public void setDailyLIMIT(double dailyLIMIT) {
        this.dailyLIMIT = dailyLIMIT;
    }
}
