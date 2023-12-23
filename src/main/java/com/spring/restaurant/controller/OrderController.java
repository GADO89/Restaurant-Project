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
    public List<Order> allOrders(@RequestParam int page,@RequestParam int size){
        return   orderService.getAllOrders(page,size);
    }

    @GetMapping("/category")
    public List<Order> getAllOrderByIdCategories(@RequestParam Long id,@RequestParam int page,@RequestParam int size){
        return orderService.getOrdersByIdCategories(id,page,size);
    }
    @GetMapping("/orderKey")  //// @GetMapping("/orderKey")
    public List<Order> getOrersByKey(@RequestParam String word,@RequestParam int page,@RequestParam int size){
        return orderService.getOrdersByKey(word,page,size);
    }

    @GetMapping("/order")
    public Order getOrderById(@RequestParam Long id){
        return orderService.getOrder(id);
    }
    @GetMapping("/orderSize")
    public long orderSize(){
        return orderService.getAllOrdersSize();
    }
    @GetMapping("/categoryidsize")
    public long  getOrderLengthByCategoryId(@RequestParam Long id){
        return orderService.getOrderLengthByCategoryId(id);
    }
}
