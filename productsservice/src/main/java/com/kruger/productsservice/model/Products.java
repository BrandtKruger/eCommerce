package com.kruger.productsservice.model;

import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Product> products;

    public Products() {
        products = new ArrayList<>();
    }

    public Products(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
