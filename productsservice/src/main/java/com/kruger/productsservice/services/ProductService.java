package com.kruger.productsservice.services;

import com.kruger.productsservice.model.PRODUCT_CONDITION;
import com.kruger.productsservice.model.PRODUCT_STATUS;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
