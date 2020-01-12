package com.kruger.productsservice.controller;

import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.services.ProductService;
import com.kruger.productsservice.services.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

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

        Set<Product> productSet = new HashSet<>();

        Product product = new Product();
        product.setId(1L);
        product.setManufacturer("A");
        product.setInStock(10);
        product.setDescription("1");
        productSet.add(product);

        Product product1 = new Product();
        product1.setId(2L);
        product1.setDescription("2");
        product1.setInStock(3);
        product1.setManufacturer("B");
        productSet.add(product1);

        when(productService.getAllProducts()).thenReturn(productSet);
        ArgumentCaptor<Set<Product>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        final String viewAllProducts = productController.getAllProducts(model);
        assertEquals("allproducts", viewAllProducts);
        verify(productService, times(1)).getAllProducts();
        verify(model, times(1)).addAttribute(eq("products"), argumentCaptor.capture());
        Set<Product> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }
}