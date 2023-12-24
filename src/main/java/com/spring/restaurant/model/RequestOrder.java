package com.spring.restaurant.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import java.util.Date;

public class RequestOrder {
    private long id;
    private String code;
    private String note;
    private int totalPrice;
    private int totalQuantity;
    private Date dataCreated;
    private Date dataUpdated;





}
