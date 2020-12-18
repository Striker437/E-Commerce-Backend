package com.Ecommerce.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DTO.Purchase;
import com.Ecommerce.DTO.PurchaseResponse;
import com.Ecommerce.Entity.Order;
import com.Ecommerce.Entity.OrderProduct;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.UserRepository;

@Service
public class CheckoutService {
	
	@Autowired
	UserRepository userRepository;
	
	
	public PurchaseResponse placeOrder(Purchase purchase)
	{
		
		//retrive the order info from dto
		
		Order order=purchase.getOrder();
		
		//generate tracking number
		
		String orderTrackingNumber=generateOrderTrackingNumber();
		order.setOrder_tracking_number(orderTrackingNumber);          //set tracking number in order table
		
		//populate order with orderproducts
		
		List<OrderProduct> orderProducts=purchase.getOrderProducts();
		
		order.setOrderItemList(orderProducts);
		
	
		  for(OrderProduct temporderProduct:orderProducts) {   //set order_id for each order product in database
		  temporderProduct.setOrder(order); }
		 
		
		//populate order with billing address  and shipping address
		
		order.setBillingAddress(purchase.getBillingAddress());
		order.setShippingAddress(purchase.getShippingAddress());
		
		System.out.println("total price of order :"+order.getTotal_price());
		System.out.println("total price of order :"+order.getTotal_quantity());
		
		
		//populate user with order
		
		User user=purchase.getUser();
		user.add(order);
		
		order.setUser(user);
		
		//save to database
		
		userRepository.save(user);
		
		//return a response
		
		return new PurchaseResponse(orderTrackingNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	private String generateOrderTrackingNumber() {
	
		//generate a random UUID Number(unique)
		
		return UUID.randomUUID().toString();
	}

}
