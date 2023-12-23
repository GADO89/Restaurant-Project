package com.spring.restaurant.controller;

import com.spring.restaurant.model.Category;
import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.CategoryService;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/allOrders")
    public List<Order> allOrders(){
        return   orderService.getAllOrders();
    }

    @GetMapping("/category")
    public List<Order> getAllOrderByIdCategories(@RequestParam Long id){
        return orderService.getOrdersByIdCategories(id);
    }

    @GetMapping("/order")
    public Order getOrderById(@RequestParam Long id){
        return orderService.getOrder(id);
    }
    @GetMapping("/orderKey")  //// @GetMapping("/orderKey")
    public List<Order> findByNameContaining(@RequestParam String word){
        return orderService.getOrersByKey(word);
    }

}
