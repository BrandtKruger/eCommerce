package com.kruger.productsservice.repositories;

import com.kruger.productsservice.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
