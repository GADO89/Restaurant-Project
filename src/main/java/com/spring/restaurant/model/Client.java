package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client extends PublicData{


    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;


    private Set<RequestOrder> requestOrders;


}
