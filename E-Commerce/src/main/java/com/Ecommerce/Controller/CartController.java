package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Cart;
import com.Ecommerce.Entity.Product;
import com.Ecommerce.Service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	
	
	
	@GetMapping("/getcart/{user_id}")
	public ResponseEntity<Cart> GetCartbyUserId(@PathVariable("user_id") int user_id)
	{
		Cart cart=cartService.GetCartbyUserId(user_id);
		return ResponseEntity.ok(cart);
	}
	
	
	   @GetMapping("/getproducts/{user_id}")
		public ResponseEntity<List<Product>> getProductsinCartbyUserId(@PathVariable("user_id")  int user_id)

		{
			
		List<Product> ProductList=cartService.getProductsByCartId(user_id);
		return ResponseEntity.ok(ProductList);
		}
	   
	   

	   
	   
	   @GetMapping("/addtoCart/{product_id}")
	   public Cart AddToCartByUserId(@PathVariable("product_id")  int product_id)
	   {
		   
		   Cart cart=cartService.AddToCartByUserId(product_id);
		   return cart;
		   
	   }
	   
	   
	   
	   
	 
	


}
