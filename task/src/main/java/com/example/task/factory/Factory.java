package com.example.task.factory;

import com.example.task.model.Bank;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Factory {
    private final Map<String, Bank> bankMap;

    public Factory(Map<String, Bank> bankMap) {
        this.bankMap = bankMap;
    }

    public Bank getBank(String method){
        Bank bank = bankMap.get(method.toLowerCase());
        if (bank == null){
            throw new RuntimeException ("there is no such method");
        }
        return bank;
    }
}
