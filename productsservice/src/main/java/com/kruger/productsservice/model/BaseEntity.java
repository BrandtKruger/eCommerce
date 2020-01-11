package com.kruger.productsservice.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

}
