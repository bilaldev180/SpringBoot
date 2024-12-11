package com.example.task.model;

import org.springframework.stereotype.Component;

@Component
public class Paypal implements Bank {

    //dto data transfer object
    @Override
    public paymentResponse paymentDetails() {
        PaypalResponse res= api();

        return new paymentResponse(res.getPaypalCURRENCY(), res.getPaypalTID(), res.getPaypalAMOUNT());
    }

    private PaypalResponse api (){
        return new PaypalResponse();
    }

    //    public String getPaymentDetails() {
//        return "paypal:"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
//    }


}

