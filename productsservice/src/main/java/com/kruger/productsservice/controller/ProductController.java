package com.kruger.productsservice.controller;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.model.Products;
import com.kruger.productsservice.services.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Slf4j
@Controller
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @RequestMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable("productId") long productId){
        log.debug("Received call to getProductById for product id - ", productId);
        return productServiceImpl.findById(productId);
    }

    @RequestMapping("/products/{category}")
    public Optional<Products> getProductsByCategory(@PathVariable("category")PRODUCT_CATEGORY category){
        log.debug("Received call to getProductsByCategory for category ", category);
        return productServiceImpl.getProductsByCategory(category);
    }

    @RequestMapping("/allproducts")
    public String getAllProducts(Model model){
        log.debug("Received call to getAllProducts.");
        model.addAttribute("products", productServiceImpl.getAllProducts());
        return "allproducts";
    }

}
