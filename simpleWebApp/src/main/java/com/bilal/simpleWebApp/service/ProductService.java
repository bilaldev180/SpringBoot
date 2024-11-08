package com.bilal.simpleWebApp.service;

import com.bilal.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products =  new ArrayList<>( Arrays.asList(new Product("Book", 1,8)
            ,new Product("book1",2,5),
            new Product("book3",3,5)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return  products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product("No Item",0,0));
    }

    public void addProduct ( Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {

        int index = 0;
        for (int i=0 ; i <products.size(); i++)
            if (products.get(i).getProdId() == product.getProdId())
                index=i;
        products.set(index,product);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i=0 ; i <products.size(); i++)
            if (products.get(i).getProdId() == prodId)
                index=i;

        products.remove(index);
    }
}
