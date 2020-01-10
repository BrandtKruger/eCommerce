package com.kruger.productsservice.repositories;

import com.kruger.productsservice.model.PRODUCT_STATUS;
import org.springframework.data.repository.CrudRepository;

public interface ProductStatusRepository extends CrudRepository<PRODUCT_STATUS, Long> {
}
