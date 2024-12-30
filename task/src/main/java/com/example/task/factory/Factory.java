package com.example.task.factory;

import com.example.task.model.PaymentMethodsInterface;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Factory {
    private final Map<String, PaymentMethodsInterface> bankMap;

    public Factory(Map<String, PaymentMethodsInterface> bankMap) {
        this.bankMap = bankMap;
    }

    public PaymentMethodsInterface getBank(String method){
        PaymentMethodsInterface bank = bankMap.get(method.toLowerCase());
        if (bank == null){
            throw new RuntimeException ("there is no such method");
        }
        return bank;
    }
}
