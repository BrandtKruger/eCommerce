package com.kruger.productsservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "productinfo")
public class Product extends BaseEntity{

    private String name;

    @Enumerated(value = EnumType.STRING)
    @NotNull
    private PRODUCT_CATEGORY category;

    @Lob
    private String description;
    private long price;

    @Column(name="product_condition")
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_CONDITION productCondition;

    @Column(name="product_status")
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_STATUS productStatus;

    @Column(name = "units_in_stock")
    @NotNull
    private int inStock;
    @NotNull
    private String manufacturer;

    public Product() {
    }
}
