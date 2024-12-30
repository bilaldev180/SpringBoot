package com.example.task.model;


import com.example.task.dto.StripeResponse;
import com.example.task.factory.PaymentRes;
import org.springframework.stereotype.Component;


//public class Stripe {
//   private int Tid;
//    private String Currency;
//   private double Amount;
//   public Stripe(int tid, String currency, double amount) {
//       Tid = tid;
//       Currency = currency;
//        Amount = amount;
//   }
//    public void setTid(int tid) {
//        Tid = tid;
//    }
//
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

@Component
public class Stripe implements PaymentMethodsInterface {



//    public String getPaymentDetails() {
//        return "stripe"+ TID + " "  + "Currency:"+CURRENCY +" " + "Amount:" +AMOUNT;
//    }

    @Override
    public PaymentRes paymentDetails() {
        StripeResponse res= api();
        return new PaymentRes(res.getStripeCurrency(), res.getStripeTid(), res.getStripeAmount());
    }

    private StripeResponse api (){
        return new StripeResponse();
    }
}