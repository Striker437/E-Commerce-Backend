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

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int totalprice;
	int quantity;
	@OneToOne
	User user;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
	 * List<Product>Productlist=new ArrayList<>();
	 */
	 

}
