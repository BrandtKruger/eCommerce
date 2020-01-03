package com.kruger.productsservice.model;

import java.util.stream.Stream;

public enum PRODUCT_CONDITION {

    NEW("New"),
    USED_GOOD("Used But Good Condition"),
    DAMAGED("Damaged");

    String conditionDescription;
    int conditionEnum;

    PRODUCT_CONDITION() {
    }

    PRODUCT_CONDITION(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }

    public void setConditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }

    public int getConditionEnum() {
        return conditionEnum;
    }

    public void setConditionEnum(int conditionEnum) {
        this.conditionEnum = conditionEnum;
    }

    public String getConditionDescription(int conditionEnum){

        return Stream.of(values())
                .filter(x -> x.getConditionEnum() == conditionEnum)
                .map(y -> y.getConditionDescription())
                .toString();
    }
}
