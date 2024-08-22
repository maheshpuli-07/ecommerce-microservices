package com.girmitisoftware.orderservice.repository;

import com.girmitisoftware.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
