package com.kruger.productsservice.controller;


import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.model.Products;
import com.kruger.productsservice.repositories.ProductRepository;
import com.kruger.productsservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable("productId") long productId){
        return productService.findById(productId);
    }

    @RequestMapping("/products/{category}")
    public Optional<Products> getProductsByCategory(@PathVariable("category")PRODUCT_CATEGORY category){
        return productService.getProductsByCategory(category);
    }

    @RequestMapping("/products")
    public Optional<Products> getAllProducts(){
        return productService.getAllProducts();

    }

}
