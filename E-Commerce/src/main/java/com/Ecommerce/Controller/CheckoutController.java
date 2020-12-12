package com.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.DTO.Purchase;
import com.Ecommerce.DTO.PurchaseResponse;
import com.Ecommerce.Service.CheckoutService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/checkout")
public class CheckoutController {
	
	
	@Autowired
	CheckoutService checkoutService;
	
	@PostMapping("/purchase")
	public PurchaseResponse purchase(@RequestBody Purchase purchase)
	{
		System.out.println("purchase :"+purchase.toString());
		PurchaseResponse purchaseResponse=checkoutService.placeOrder(purchase);
		return purchaseResponse;
	}

}
