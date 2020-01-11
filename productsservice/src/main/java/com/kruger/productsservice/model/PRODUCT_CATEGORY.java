package com.kruger.productsservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.stream.Stream;

@Entity
@Table(name = "productcategory")
public enum PRODUCT_CATEGORY {

    IPHONE("iPhone"),
    MAC_BOOK_PRO("MacBook Pro"),
    MAC_BOOK_AIR("MacBook Air"),
    MAC_MINI("Mac Mini"),
    IPAD("iPad"),
    WATCH("Apple Watch"),
    APPLE_TV("Apple TV");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @NotNull
    private PRODUCT_CATEGORY category;

    @Transient
    private String productCategoryDescription;
    @Transient
    private int productCategoryEnum;

    PRODUCT_CATEGORY() {
    }

    PRODUCT_CATEGORY(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PRODUCT_CATEGORY getCategory() {
        return category;
    }

    public void setCategory(PRODUCT_CATEGORY product_category) {
        this.category = product_category;
    }

    public String getProductCategoryDescription() {
        return productCategoryDescription;
    }

    public void setProductCategoryDescription(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }

    public int getProductCategoryEnum() {
        return productCategoryEnum;
    }

    public void setProductCategoryEnum(int productCategoryEnum) {
        this.productCategoryEnum = productCategoryEnum;
    }

    public String getProductCategoryDescription(int productCategoryEnum){
        return Stream.of(values())
                .filter(x -> x.productCategoryEnum == productCategoryEnum)
                .map(x -> x.getProductCategoryDescription())
                .toString();
    }

}
