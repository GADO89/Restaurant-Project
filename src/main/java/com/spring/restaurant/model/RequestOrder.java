package com.spring.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

   // @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "requestOrder")
    private Set<Item> items;

   // @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "to_address_id", referencedColumnName = "id")
    private Address toAddress;

    @OneToOne
    @JoinColumn(name = "from_address_id", referencedColumnName = "id")
    private Address fromAddress;







}
