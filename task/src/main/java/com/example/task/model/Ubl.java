package com.example.task.model;

import com.example.task.dto.UblResponse;
import com.example.task.factory.PaymentRes;
import org.springframework.stereotype.Component;

@Component
public class Ubl implements PaymentMethodsInterface {




    @Override
    public PaymentRes paymentDetails()
    {
        UblResponse res = api();
        return new PaymentRes(res.getUblCurrency(),res.getUblTid(), res.getUblAmount());
    }

    private UblResponse api (){
        return new UblResponse();
    }
}
