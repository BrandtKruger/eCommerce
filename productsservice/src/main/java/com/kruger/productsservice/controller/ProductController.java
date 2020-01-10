package com.kruger.productsservice.controller;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.model.Products;
import com.kruger.productsservice.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @RequestMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable("productId") long productId){
        return productServiceImpl.findById(productId);
    }

    @RequestMapping("/products/{category}")
    public Optional<Products> getProductsByCategory(@PathVariable("category")PRODUCT_CATEGORY category){
        return productServiceImpl.getProductsByCategory(category);
    }

    @RequestMapping("/products")
    public Optional<Products> getAllProducts(){
        return productServiceImpl.getAllProducts();

    }

}
