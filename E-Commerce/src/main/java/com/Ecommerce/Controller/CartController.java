package com.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	
	
	/*
	 * @PostMapping("/{id}") public Cart AdditemtoCart(@PathVariable("id") int id) {
	 * Cart cart=cartService.AdditemtoCart(id); return null;
	 * 
	 * }
	 */

}
