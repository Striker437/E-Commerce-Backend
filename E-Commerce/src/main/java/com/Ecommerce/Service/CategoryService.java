package com.Ecommerce.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Entity.Category;
import com.Ecommerce.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
		
		
		
	}

	public void AddCategory(Category category) {
		categoryRepository.save(category);
		
	}

	public Optional<Category> getCategoryById(int id) {
		
		return categoryRepository.findById(id);
	}
	
	public Category UpdateCategoryById(int id, Category category)
	{
	//  Optional<Category> optional=categoryRepository.findById(id);
	// Category category=optional.get();
	 // category.setType("Stationary");
	  return categoryRepository.save(category);  //commit to database
	}

	public void deleteById(int id) {
		categoryRepository.deleteById(id);
		
	}

	

}
