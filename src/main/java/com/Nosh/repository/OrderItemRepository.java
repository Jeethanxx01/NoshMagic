package com.Nosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nosh.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
