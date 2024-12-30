package com.bilal.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@AllArgsConstructor
@Data
@Component
@Entity

public class Product {
    @Id
    private int prodId;
    private String productName;

    private int productPrice;
}
