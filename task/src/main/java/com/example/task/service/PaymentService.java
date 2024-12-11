package com.example.task.service;

import com.example.task.factory.Factory;
import com.example.task.model.Paypal;
//import com.example.task.model.Stripe;
import com.example.task.model.paymentResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

//    private Stripe stripe;
//    private Paypal paypal;
//
//    public PaymentService(Stripe stripe , Paypal paypal){
//      this.stripe=stripe;
//      this.paypal=paypal;
//    }
//    public String paymentProcessStripe() {
//        return stripe.getPaymentDetails();
//    }
//
//    public String paymentProcessPaypal() {
//        return paypal.getPaymentDetails();
//    }

    private Factory factory;

    public PaymentService(Factory factory) {
        this.factory = factory;
    }

    public paymentResponse getPaymentMethod(String method) {
//        if ("paypal".equals(method)){
//            return paypal.getPaymentDetails();
//        } else if ("stripe".equals(method)) {
//            return stripe.getPaymentDetails();
//        }
//        else
//            return "wrong payment method";
        return factory.getBank(method).paymentDetails();
   }

}
