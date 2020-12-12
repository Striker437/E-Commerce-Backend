package com.Ecommerce.Entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "orders")
public class Order{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String address;
	@CreationTimestamp
	Date date_created;
	@UpdateTimestamp
	Date last_updated;
	int total_price;
	int total_quantity;
	String order_tracking_number;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipping_address_id",  referencedColumnName = "id")
	Address shippingAddress;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "billing_address_id" ,  referencedColumnName="id")
	Address billingAddress;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	List<OrderProduct> orderItemList=new ArrayList<>();
	
	 @ManyToOne
	   User user;
	
	 
	 
	 
	 
	 
	 
	public void add(OrderProduct item)
	{
		if(item!=null)
		{
			if(orderItemList==null)
				orderItemList=new ArrayList<>();
			
			orderItemList.add(item);
			item.setOrder(this);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}

	public String getOrder_tracking_number() {
		return order_tracking_number;
	}

	public void setOrder_tracking_number(String order_tracking_number) {
		this.order_tracking_number = order_tracking_number;
	}

	public List<OrderProduct> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderProduct> orderItemList) {
		this.orderItemList = orderItemList;
	}

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
	
	
	
	
	 
	 
	
	
	

}
