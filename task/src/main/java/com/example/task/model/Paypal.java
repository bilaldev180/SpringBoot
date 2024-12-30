package com.example.task.model;

import com.example.task.dto.PaypalResponse;
import com.example.task.factory.PaymentRes;
import org.springframework.stereotype.Component;

@Component
public class Paypal implements PaymentMethodsInterface {

    //dto data transfer object
    @Override
    public PaymentRes paymentDetails() {
        PaypalResponse res= api();

        return new PaymentRes(res.getPaypalCURRENCY(), res.getPaypalTID(), res.getPaypalAMOUNT());
    }

    private PaypalResponse api (){
        return new PaypalResponse();
    }

    //    public String getPaymentDetails() {
//        return "paypal:"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
//    }


}

