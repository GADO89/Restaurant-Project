package com.spring.restaurant.model;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "request_order")
public class RequestOrder extends CategoryOrder{

    @Column(name = "code")
    private String code;

    @Column(name = "note")
    @Lob
    private String note;

    @Column(name = "total_price")
    private int totalPrice;

    @Column(name = "total_quantity")
    private int totalQuantity;

    @OneToMany(mappedBy = "requestOrder")
    private Set<Item> items;


    private Client client;

    private Address address;








}
