package com.bilal.simpleWebApp.service;

import com.bilal.simpleWebApp.model.Product;
import com.bilal.simpleWebApp.repository.ProductRepo;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products =  new ArrayList<>( Arrays.asList(new Product("Book", 1,8)
//            ,new Product("book1",2,5),
//            new Product("book3",3,5)
//    ));

    public List<Product> getProducts()
    {
        return repo.findAll();

    }

    public Product getProductById(int prodId) {
        return  repo.findById(prodId).orElse(new Product());
    }

    public void addProduct ( Product product)
    {
        repo.save(product);
    }

    public void updateProduct(Product product) {

        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
