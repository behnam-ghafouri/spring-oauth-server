package com.example.demoapi2.service;

import com.example.demoapi2.models.Order;
import com.example.demoapi2.models.Product;
import com.example.demoapi2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }
}
