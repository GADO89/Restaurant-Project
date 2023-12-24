package com.spring.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="country")
@NoArgsConstructor
@AllArgsConstructor
public class Country extends PublicData {

    @Column(name ="code")
    private Long code;

    @OneToMany(mappedBy = "countries")
  private Set<State> states;

}
