package com.kruger.productsservice.model;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product;

    @BeforeEach
    public void setUp(){
        product = new Product();
    }

    @Test
    void getName() {
        final String name = "Product_1";
        product.setName(name);
        assertEquals(name, product.getName());
    }

    @Test
    void getCategory() {
        final PRODUCT_CATEGORY category = PRODUCT_CATEGORY.APPLE_TV;
        product.setCategory(category);
        assertEquals(category, product.getCategory());
    }

    @Test
    void getDescription() {
        final String description = "Description_1";
        product.setDescription(description);
        assertEquals(description, product.getDescription());
    }

    @Test
    void getPrice() {
        final long price = 23400;
        product.setPrice(price);
        assertEquals(price, product.getPrice());
    }

    @Test
    void getProductCondition() {
        final PRODUCT_CONDITION product_condition = PRODUCT_CONDITION.NEW;
        product.setProductCondition(product_condition);
        assertEquals(product_condition, product.getProductCondition());
    }

    @Test
    void getProductStatus() {
        final PRODUCT_STATUS product_status = PRODUCT_STATUS.IN_STOCK;
        product.setProductStatus(product_status);
        assertEquals(product_status, product.getProductStatus());
    }

    @Test
    void getInStock() {
        final int inStock = 5;
        product.setInStock(inStock);
        assertEquals(inStock, product.getInStock());
    }

    @Test
    void getManufacturer() {
        final String manufacturer = "Apple";
        product.setManufacturer(manufacturer);
        assertEquals(manufacturer, product.getManufacturer());
    }
}