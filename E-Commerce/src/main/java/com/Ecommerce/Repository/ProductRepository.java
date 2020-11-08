package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
