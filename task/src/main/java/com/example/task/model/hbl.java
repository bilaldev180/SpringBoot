package com.example.task.model;

import org.springframework.stereotype.Component;

@Component
public class hbl implements Bank{
    private static final String CURRENCY = "$";
    private static final int TID = 20;
    private static final double AMOUNT = 100;

    @Override
    public String paymentDetails() {
        return "hbL"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
    }
}
