package com.kruger.productsservice.repositories;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.services.ProductService;
import com.kruger.productsservice.services.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductRepositoryTest {

    @Mock
    ProductRepository productRepository;
    ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        productService = new ProductServiceImpl(productRepository);
    }

    @Test
    void findAllProducts() {

        Product product = new Product();
        HashSet products =  new HashSet();
        products.add(product);

        when(productRepository.findAll()).thenReturn(products);
        Set<Product> productSet = productService.getAllProducts();
        assertEquals(productSet.size(), 1);
        verify(productRepository, times(1)).findAll();
    }
}