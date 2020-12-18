package com.Ecommerce.DTO;

import java.util.List;

import com.Ecommerce.Entity.Address;
import com.Ecommerce.Entity.Order;
import com.Ecommerce.Entity.OrderProduct;
import com.Ecommerce.Entity.User;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



public class Purchase {
	
	
	private User user;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private List<OrderProduct> orderProducts;
	
	
	
	
	
	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Purchase [user=" + user.toString() + ", shippingAdress=" + shippingAddress + ", billingAddress=" + billingAddress
				+ ", order=" + order + ", orderProducts=" + orderProducts.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
