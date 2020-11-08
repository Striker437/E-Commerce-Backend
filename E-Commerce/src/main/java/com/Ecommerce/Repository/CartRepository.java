package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
