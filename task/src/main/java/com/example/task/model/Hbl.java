package com.example.task.model;

import com.example.task.dto.HBLResponse;
import com.example.task.factory.PaymentRes;
import org.springframework.stereotype.Component;

@Component
public class Hbl implements PaymentMethodsInterface {


    @Override
    public PaymentRes paymentDetails() {
        HBLResponse res = api();
    return new PaymentRes(res.getHblCurrency(), res.getHblTid(), res.getHblAmount());
    }

    private HBLResponse api(){
        return new HBLResponse();
    }
}
