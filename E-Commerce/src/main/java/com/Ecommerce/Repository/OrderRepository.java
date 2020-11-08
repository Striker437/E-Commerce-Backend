package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
