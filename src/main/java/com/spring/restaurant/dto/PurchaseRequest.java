package com.spring.restaurant.dto;

import com.spring.restaurant.model.Address;
import com.spring.restaurant.model.Client;
import com.spring.restaurant.model.Item;
import com.spring.restaurant.model.RequestOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data

public class PurchaseRequest {

    private Client client;
    private RequestOrder requestOrder;
    private Set<Item> items;
    private Address fromAddress;
    private Address toAddress;



}
