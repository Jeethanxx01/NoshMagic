package com.Nosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nosh.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
