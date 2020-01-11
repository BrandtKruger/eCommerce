package com.kruger.productsservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.stream.Stream;

@Entity
@Table(name = "productcondition")
public enum PRODUCT_CONDITION {

    NEW("New"),
    USED_GOOD("Used But Good Condition"),
    DAMAGED("Damaged");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "product_condition")
    @NotNull
    @Enumerated(value = EnumType.STRING)
    private PRODUCT_CONDITION product_condition;
    @Transient
    private int conditionEnum;
    @Transient
    private String conditionDescription;

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
