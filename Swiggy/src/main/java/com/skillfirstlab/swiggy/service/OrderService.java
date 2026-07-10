package com.skillfirstlab.swiggy.service;

import com.skillfirstlab.swiggy.entity.Order;
import com.skillfirstlab.swiggy.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Create Order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get All Orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get Order By Id
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Update Order
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    // Delete Order
    public String deleteOrder(int id) {
        orderRepository.deleteById(id);
        return "Order Deleted Successfully";
    }
}