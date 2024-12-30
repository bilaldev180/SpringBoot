package com.example.task.controller;

import com.example.task.factory.PaymentRes;
import com.example.task.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class PaymentController {


    private PaymentService service;


    public PaymentController(PaymentService service) {
        this.service = service;
    }

    //    @GetMapping ("/stripe")
//    public String paymentProcessStripe(){
//        return service.paymentProcessStripe();
//    }
//
//    @GetMapping ("/paypal")
//    public String paymentProcessPaypal(){
//        return service.paymentProcessPaypal();
//    }

    @GetMapping ("/payment")
    public PaymentRes paymentProcess(@RequestParam String method)
    {
        return service.getPaymentMethod(method);

    }
}
