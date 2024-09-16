package com.nosh.service;

import com.nosh.model.Order;
import com.nosh.model.User;
import com.nosh.request.OrderRequest;

import java.util.List;

public interface OrderService {

    public Order createOrder(OrderRequest order, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus)throws Exception;

    public Void cancelOrder(Long orderId)throws Exception;

    public List<Order> getUsersOrder(Long userId)throws Exception;

    public List<Order> getRestaurantsOrder(Long restaurantId,String orderStatus)throws Exception;

    public Order findOrderById(Long orderId)throws Exception;

}
