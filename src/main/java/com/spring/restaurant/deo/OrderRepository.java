package com.spring.restaurant.deo;

import com.spring.restaurant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public List<Order> findByCategoryId(Long id);
}
