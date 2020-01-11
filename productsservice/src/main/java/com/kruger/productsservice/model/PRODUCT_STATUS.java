package com.kruger.productsservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.stream.Stream;

@Entity
@Table(name = "productstatus")
public enum PRODUCT_STATUS {

    IN_STOCK("In Stock"),
    IN_TRANSIT("In Transit"),
    DELIVERED("Delivered"),
    MISSING("Lost"),
    NO_STOCK("No Stock"),
    ORDERED("Ordered"),
    WAITING_FOT_STOCK("Waiting For Stock");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "product_status")
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_CONDITION product_status;

    @Transient
    private String productStatusDescription;
    @Transient
    private int productStatusEnum;

    PRODUCT_STATUS() {
    }

    PRODUCT_STATUS(int productStatusEnum, String productStatusDescription) {
        this.productStatusEnum = productStatusEnum;
        this.productStatusDescription = productStatusDescription;
    }

    PRODUCT_STATUS(String productStatusDescription) {
        this.productStatusDescription = productStatusDescription;
    }

    public int getProductStatusEnum() {
        return productStatusEnum;
    }

    public void setProductStatusEnum(int productStatusEnum) {
        this.productStatusEnum = productStatusEnum;
    }

    public String getProductStatusDescription() {
        return productStatusDescription;
    }

    public void setProductStatusDescription(String productStatusDescription) {
        this.productStatusDescription = productStatusDescription;
    }

    public String getProductStatusDescription(int productStatusEnum){

        return Stream.of(values())
                .filter(x -> x.productStatusEnum == productStatusEnum)
                .map(x -> x.getProductStatusDescription())
                .toString();
    }
}
