package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Cart GetCartbyUserId(@PathVariable("user_id") int user_id)
	{
		Cart cart=cartService.GetCartbyUserId(user_id);
		return cart;
	}
	
	
	   @GetMapping("/getproducts/{user_id}")
		public List<Product> getProductsInCartbyUserId(@PathVariable("user_id")  int user_id)
		{
			
		List<Product> ProductList=cartService.getProductsByCartId(user_id);
		return ProductList;
		}
	   
	   
	   
	   
	   @GetMapping("/addtoCart/{product_id}")
	   public Cart AddToCartByUserId(@PathVariable("product_id")  int product_id)
	   {
		   
		   Cart cart=cartService.AddToCartByUserId(product_id);
		   return cart;
		   
	   }
	   
	   
	   
	   
	 
	

}
