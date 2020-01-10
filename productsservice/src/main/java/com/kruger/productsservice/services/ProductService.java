package com.kruger.productsservice.services;

import com.kruger.productsservice.model.*;
import com.kruger.productsservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> getProductById(long productId){
        return productRepository.findById(productId);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Products getProductsByCategory(PRODUCT_CATEGORY category){
        List<Product> products =  productRepository.findByCategory(category);
        return (Products) products;
    }

}
