package com.kruger.productsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "productinfo")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String name;

    @Enumerated(value = EnumType.STRING)
    private PRODUCT_CATEGORY category;

    @Lob
    private String description;
    private long price;

    @Column(name="product_condition")
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_CONDITION productCondition;

    @Column(name="product_status")
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_STATUS productStatus;

    @Column(name = "units_in_stock")
    private int inStock;
    private String manufacturer;

    public Product() {
    }

    public void setId(Long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PRODUCT_CATEGORY getCategory() {
        return category;
    }

    public void setCategory(PRODUCT_CATEGORY category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public PRODUCT_CONDITION getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(PRODUCT_CONDITION productCondition) {
        this.productCondition = productCondition;
    }

    public PRODUCT_STATUS getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(PRODUCT_STATUS productStatus) {
        this.productStatus = productStatus;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
