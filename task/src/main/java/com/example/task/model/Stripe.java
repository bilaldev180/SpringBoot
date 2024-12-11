package com.example.task.model;


import org.springframework.stereotype.Component;

//
//public class Stripe {
//    private int Tid;
//    private String Currency;
//    private double Amount;
//
//    public Stripe(int tid, String currency, double amount) {
//        Tid = tid;
//        Currency = currency;
//        Amount = amount;
//    }
//
//    public void setTid(int tid) {
//        Tid = tid;
//    }
//
//    public void setCurrency(String currency) {
//        Currency = currency;
//    }
//
//    public void setAmount(double amount) {
//        Amount = amount;
//    }
//
//    public int getTid() {
//        return Tid;
//    }
//
//    public String getCurrency() {
//        return Currency;
//    }
//
//    public double getAmount() {
//        return Amount;
//    }
//}

//@Component
//public class Stripe implements Bank {
//
//    private static final String CURRENCY = "AED";
//    private static final int TID = 20;
//    private static final double AMOUNT = 1000.0/100;
//
////    public String getPaymentDetails() {
////        return "stripe"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
////    }
//
//    @Override
//    public paymentResponse paymentDetails() {
//        return new paymentResponse(CURRENCY,TID,AMOUNT);
//    }
//}