package com.Ecommerce.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Cart {

	public Cart() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int totalprice;
	int quantity;

	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cart")
	User user;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	List<Product> Productlist = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductlist() {
		return Productlist;
	}

	public void setProductlist(List<Product> productlist) {
		Productlist = productlist;
	}

}
