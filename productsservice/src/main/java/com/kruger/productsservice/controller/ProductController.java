package com.kruger.productsservice.controller;


import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable("productId") long productId){
        return productService.getProductById(productId);
    }

    @RequestMapping(value = "addproduct", method = RequestMethod.POST)
    public void addProduct( @ModelAttribute("product")Product product){
        productService.addProduct(product);
    }
}
