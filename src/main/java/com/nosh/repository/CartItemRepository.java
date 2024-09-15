package com.nosh.repository;

import com.nosh.model.Cart;
import com.nosh.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {



}
