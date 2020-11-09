package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Category;
import com.Ecommerce.Entity.Product;
import com.Ecommerce.Repository.ProductRepository;
import com.Ecommerce.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getall")
	public List<Product> getAllProducts()
	{
		
		List<Product> ProductList=productService.getAllProducts();
		System.out.println("Productlist");
		return ProductList;
		
		
	}
	
	@GetMapping("/getProductsByCategory")
	public List<Product> getProductsByCategory(@RequestBody Product product)
	{
		int Category_id=product.getCategory().getId();
		List<Product> productListbyCategory=productService.getProductsByCategory(Category_id);
		return productListbyCategory;
		
	}
	
	/*
	 * @PostMapping("/getproductbyCategory") public List<Product>
	 * getProductByCategory(@RequestBody) {
	 * 
	 * }
	 */
 	
	
	
	
	
	
	
	
	

}