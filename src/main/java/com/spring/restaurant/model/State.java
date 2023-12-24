package com.spring.restaurant.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name ="state")
public class State extends PublicData{

    @ManyToOne
    @JoinColumn(name = "Country_id")
    private Country countries;

}
