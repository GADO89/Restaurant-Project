package com.spring.restaurant.deo;

import com.spring.restaurant.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public Page<Order> findByCategoryId(Long id, Pageable pageable);

    public Page<Order> findByNameContaining(String name, Pageable pageable );



}
