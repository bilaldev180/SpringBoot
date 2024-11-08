package com.bilal.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data

public class Product {
    private String productName;
    private int prodId;
    private int productPrice;
}
