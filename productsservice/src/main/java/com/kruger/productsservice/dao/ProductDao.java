package com.kruger.productsservice.dao;

import com.kruger.productsservice.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface ProductDao extends CrudRepository<Product, Long> {
}
