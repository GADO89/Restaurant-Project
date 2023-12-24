package com.spring.restaurant.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
@Data
@MappedSuperclass
public class PublicData extends BaseEntity{


    @Column(name = "name")
    private String name;  // Egypt
}
