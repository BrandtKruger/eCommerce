package com.kruger.productsservice.controller;

import com.kruger.productsservice.services.ProductService;
import com.kruger.productsservice.services.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ProductControllerTest {

    @Mock
    ProductServiceImpl productService;
    @Mock
    Model model;
    ProductController productController;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        productController = new ProductController(productService);
    }

    @Test
    void getProductById() {
    }

    @Test
    void getProductsByCategory() {
    }

    @Test
    void getAllProducts() {
        final String viewAllProducts = productController.getAllProducts(model);
        assertEquals("allproducts", viewAllProducts);
        verify(productService, times(1)).getAllProducts();
        verify(model, times(1)).addAttribute(eq("products"), anySet());
    }
}