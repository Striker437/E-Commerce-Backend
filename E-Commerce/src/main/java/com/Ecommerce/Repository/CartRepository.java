package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Product;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	
	@Query("select u from Product u where u.cart.id=:cart_id")
	List<Product> findProductsByCartId(@Param("cart_id") int cart_id);

}
