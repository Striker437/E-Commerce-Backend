package com.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Product;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.CartRepository;
import com.Ecommerce.Repository.UserRepository;

@Service
public class CartService {
	
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CartRepository cartRepository;

	public Cart GetCartbyUserId(int user_id) {
		
		Optional<User> optional=userRepository.findById(user_id);
		User user=optional.get();
		int cart_id=user.getCart().getId();
	    Optional<Cart> optionalcart=cartRepository.findById(cart_id);
	    Cart cart=optionalcart.get();
	    return cart;
		
		
		
	}

	public List<Product> getProductsByCartId(int user_id) {
		
		Optional<User> optional=userRepository.findById(user_id);
		User user=optional.get();
		int cart_id=user.getCart().getId();
		List<Product> productlist=cartRepository.findProductsByCartId(cart_id);
		return productlist;
	}

	

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
