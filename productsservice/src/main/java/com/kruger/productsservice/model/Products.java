package com.kruger.productsservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Products {

    List<Product> products;

    public Products() {
        products = new ArrayList<>();
    }

    public Products(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
