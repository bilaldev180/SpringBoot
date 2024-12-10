package com.example.task.controller;

import com.example.task.model.paymentResponse;
import com.example.task.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class PaymentController {

    @Autowired
    private PaymentService service;

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
    public paymentResponse paymentProcess(@RequestParam String method){
        return service.getPaymentMethod(method);
    }
}
