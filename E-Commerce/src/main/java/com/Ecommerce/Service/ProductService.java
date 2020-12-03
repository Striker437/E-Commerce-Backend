package com.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Entity.Category;
import com.Ecommerce.Entity.Product;
import com.Ecommerce.Repository.CategoryRepository;
import com.Ecommerce.Repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
		
		
	}

	public List<Product> getProductsByCategory(int category_id) {
		return productRepository.findAllById(category_id);
		
	}

	public void saveProduct(Product product) {
		
		productRepository.save(product);
		
		
	}

	public List<Product> DeleteById(int id) {
		
		productRepository.deleteById(id);
		return productRepository.findAll();
		
		
		
		
		
		
	}
public List<Product> DeleteProductCategory(int id) {
		
	
	Optional<Product> optional=productRepository.findById(id);
		productRepository.deleteById(id);
		
		Product product=optional.get();
		int category_id=product.getCategory().getId();
		return productRepository.findAllById(category_id);
		
		
		
		
		
		
	}

	public Product getProductDetail(int id) {
		
		Optional<Product> optional=productRepository.findById(id);
		Product product=optional.get();
		return product;
	}

	public List<Product> getProductsByContainingName(String keyword) {
		return productRepository.findByNameContaining(keyword);
	}
	
	

}
