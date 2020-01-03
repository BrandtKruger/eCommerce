package com.kruger.productsservice.services;

import com.kruger.productsservice.dao.ProductDao;
import com.kruger.productsservice.model.PRODUCT_CONDITION;
import com.kruger.productsservice.model.PRODUCT_STATUS;
import com.kruger.productsservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Optional<Product> getProductById(long productId){
        return productDao.findById(productId);
    }

    public void addProduct(Product product){
        productDao.save(product);
    }

}
