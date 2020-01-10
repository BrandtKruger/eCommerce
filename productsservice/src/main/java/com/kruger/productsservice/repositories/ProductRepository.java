package com.kruger.productsservice.repositories;

import com.kruger.productsservice.model.PRODUCT_CATEGORY;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByCategory(PRODUCT_CATEGORY category);

}
