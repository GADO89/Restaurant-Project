package com.spring.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private Set<RequestOrder> requestOrders;


}