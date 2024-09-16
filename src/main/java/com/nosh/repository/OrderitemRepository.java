package com.nosh.repository;

import com.nosh.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderitemRepository extends JpaRepository<OrderItem,Long> {

}
