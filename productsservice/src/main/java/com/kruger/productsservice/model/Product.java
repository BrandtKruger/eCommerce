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
    private String category;

    @Lob
    private Byte[] description;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Byte[] getDescription() {
        return description;
    }

    public void setDescription(Byte[] description) {
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
