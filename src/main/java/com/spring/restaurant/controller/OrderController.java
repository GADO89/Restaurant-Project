package com.spring.restaurant.controller;

import com.spring.restaurant.model.Category;
import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.CategoryService;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/api/allOrders")
    public List<Order> allOrders(){
        return   orderService.getAllOrders();
    }

    @GetMapping("/api/category")
    public List<Order> getAllOrderByIdCategories(@RequestParam Long id){
        return orderService.getOrdersByIdCategories(id);
    }


}
