package com.kruger.productsservice.repositories;

import com.kruger.productsservice.model.PRODUCT_CONDITION;
import org.springframework.data.repository.CrudRepository;

public interface ProductConditionRepository extends CrudRepository<PRODUCT_CONDITION, Long> {
}
