package com.kruger.productsservice.services;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.PRODUCT_CONDITION;
import com.kruger.productsservice.model.PRODUCT_STATUS;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.repositories.ProductRepository;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    private  Set<Product> productSet = new HashSet<>();
    private static long productId;

    ProductServiceImpl productService;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void Setup( ) throws Exception{
        MockitoAnnotations.initMocks(this);
        productService = new ProductServiceImpl(productRepository);
    }

    @Test
    void getProductById() {

        Product product = createiPhoneProduct();
        productService.addProduct(product);
        when(productRepository.findById(product.getId())).thenReturn(java.util.Optional.ofNullable(product));

        assertEquals(product.getId(), productRepository.findById(product.getId()).get().getId());
        verify(productRepository, times(1)).findById(product.getId());
    }

    @Test
    void addProduct() {
        Product product = createiPhoneProduct();
        when(productRepository.save(any(Product.class))).thenReturn(product);
        productService.addProduct(product);
        Set<Product>  productSet = productService.getAllProducts();
        verify( productRepository, times(1)).save(any(Product.class));
    }

    @Test
    void getProductsByCategory() {
        Product product = createiPhoneProduct();
        List<Product> productList = new ArrayList<>();
        when(productRepository.findByCategory(PRODUCT_CATEGORY.IPHONE)).thenReturn(productList);

        productService.getProductsByCategory(PRODUCT_CATEGORY.IPHONE);
        assertEquals("iPhone", product.getName());
        verify(productRepository, times(1)).findByCategory(product.getCategory());
    }

    @Test
    void findById() {
        Product product = createiPhoneProduct();
        when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));
        Optional<Product> productOptional = productService.getProductById(product.getId());
        assertEquals(product.getId(), productOptional.get().getId());
        verify(productRepository, times(1)).findById(product.getId());
    }

    @Test
    void getAllProducts() {
        Product product = createiPhoneProduct();
        Product product1 = createMacBookProduct();
        Set<Product> productSet = addProductToSet();
        productSet.add(product);
        productSet.add(product1);
        when(productRepository.findAll()).thenReturn(productSet);
        Set<Product>  productSet1 = productService.getAllProducts();
        assertEquals(2 ,productSet1.size());
        verify(productRepository, times(1)).findAll();
    }

    private Product createiPhoneProduct() {

        Product product = new Product();
        product.setManufacturer("Apple");
        product.setInStock(10);
        product.setDescription("Phone");
        product.setProductStatus(PRODUCT_STATUS.IN_STOCK);
        product.setPrice(2300);
        product.setCategory(PRODUCT_CATEGORY.IPHONE);
        product.setName("iPhone");
        product.setProductCondition(PRODUCT_CONDITION.NEW);
        product.setId((long) productId++);

        return product;
    }

    private Product createMacBookProduct() {

        Product product = new Product();
        product.setManufacturer("Apple");
        product.setInStock(10);
        product.setDescription("MacBook");
        product.setProductStatus(PRODUCT_STATUS.IN_STOCK);
        product.setPrice(234400);
        product.setCategory(PRODUCT_CATEGORY.MAC_BOOK_PRO);
        product.setName("iPhone");
        product.setProductCondition(PRODUCT_CONDITION.NEW);
        product.setId((long) productId++);

        return product;
    }

    private Set<Product> addProductToSet(){
        productSet = new HashSet<>();
        return productSet;
    }

}