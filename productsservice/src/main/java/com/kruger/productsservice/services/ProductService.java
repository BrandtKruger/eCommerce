package com.kruger.productsservice.services;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.model.Products;

import java.util.Optional;

public interface ProductService {

    public Optional<Product> getProductById(long productId);
    public void addProduct(Product product);
    public Optional<Products> getProductsByCategory(PRODUCT_CATEGORY category);
    public Optional<Product> findById(long productId);
    public Optional<Products> getAllProducts();

}
