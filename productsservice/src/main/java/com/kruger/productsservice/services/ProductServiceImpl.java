package com.kruger.productsservice.services;

import com.kruger.productsservice.model.*;
import com.kruger.productsservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> getProductById(long productId){
        return productRepository.findById(productId);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public Optional<Products> getProductsByCategory(PRODUCT_CATEGORY category){
        List<Product> products =  productRepository.findByCategory(category);
        Products product = new Products();
        product.setProducts(products);
        return Optional.of(product);
    }

    public Optional<Product> findById(long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Set<Product> getAllProducts() {
        Set<Product> productSet = new HashSet<>();
        productRepository.findAll().iterator().forEachRemaining(productSet::add);
        return productSet;
    }
}
