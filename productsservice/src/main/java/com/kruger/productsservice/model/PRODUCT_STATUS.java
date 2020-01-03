package com.kruger.productsservice.model;

import java.util.stream.Stream;

public enum PRODUCT_STATUS {

    IN_STOCK("In Stock"),
    IN_TRANSIT("In Transit"),
    DELIVERED("Delivered"),
    MISSING("Lost"),
    NO_STOCK("No Stock"),
    ORDERED("Ordered"),
    WAITING_FOT_STOCK("Waiting For Stock");

    int productStatusEnum;
    String productStatusDescription;

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
