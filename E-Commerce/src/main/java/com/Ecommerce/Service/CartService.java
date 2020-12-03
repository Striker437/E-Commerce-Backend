package com.Ecommerce.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Product;

@Service
public class CartService {
	
	
	@Autowired
	ProductService productService;

	/*
	 * public Cart AdditemtoCart(int id) {
	 * 
	 * Optional<Product>optional=productService.getProductDetail(id); Product
	 * product=optional.get(); Cart cart=new Cart(); product.getPrice();
	 * if(cart.getTotalprice()==0) int
	 * total_price=cart.getTotalprice()+product.getPrice(); int
	 * quantity=cart.getQuantity()+1; cart.setQuantity(quantity);
	 * cart.setTotalprice(total_price);
	 * 
	 * 
	 * 
	 * 
	 * return null; }
	 */

}
