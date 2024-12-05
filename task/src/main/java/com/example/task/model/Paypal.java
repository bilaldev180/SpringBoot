package com.example.task.model;

import org.springframework.stereotype.Component;

@Component
public class Paypal implements Bank {
    private static final String CURRENCY = "$";
    private static final int TID = 20;
    private static final double AMOUNT = 100;

//    public String getPaymentDetails() {
//        return "paypal:"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
//    }

    @Override
    public String paymentDetails() {
        return "paypal:"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
    }
}
