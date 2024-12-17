package com.Nosh.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.Nosh.Exception.CartException;
import com.Nosh.Exception.OrderException;
import com.Nosh.Exception.RestaurantException;
import com.Nosh.Exception.UserException;
import com.Nosh.model.Order;
import com.Nosh.model.User;
import com.Nosh.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
