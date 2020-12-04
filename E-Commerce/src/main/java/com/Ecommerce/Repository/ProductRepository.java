package com.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.Ecommerce.Entity.Product;


@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	@Query("select u from Product u where u.category.id=:category_id")
	List<Product> findAllById(@Param("category_id") int category_id);

	List<Product> findByNameContaining(@Param("keyword") String keyword);

}
