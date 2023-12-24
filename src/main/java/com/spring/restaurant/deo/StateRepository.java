package com.spring.restaurant.deo;

import com.spring.restaurant.model.Country;
import com.spring.restaurant.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

    //@Query("select count (id) from  State where name LIKE %?1")
    public List<State> findByCountryCode(String code);

}
