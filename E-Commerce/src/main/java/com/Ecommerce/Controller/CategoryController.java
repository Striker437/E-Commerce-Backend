package com.Ecommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Category;
import com.Ecommerce.Repository.CategoryRepository;
import com.Ecommerce.Service.CategoryService;
import com.Ecommerce.Service.ProductService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	CategoryService categoryService;
	
	
	//get all categories
	@GetMapping("/")
	public List<Category> getAllCategory()
	{
		
		List<Category> CategoryList=categoryService.getAllCategory();
		System.out.println("Category list"+CategoryList.toString());
		return CategoryList;
		
		
		
	}
	
	
	//Add a category by id in database from client
	@PostMapping("/")
	public void AddCategory(@RequestBody Category category)
	{
		categoryService.AddCategory(category);
	  
	}
	
	//get a category by id from database
	@GetMapping("/{Id}")
	public Category getCategoryById(@PathVariable("Id") int Id)
	{
		Optional<Category> optional=categoryService.getCategoryById(Id);
		Category category=optional.get();
		return category;
	}
	
	//Update a category by id
	
	@PutMapping("/{Id}")
	public void UpdateCategoryById(@PathVariable("Id") int Id, @RequestBody Category category)
	{
		categoryService.UpdateCategoryById(Id, category);
	}
	
	
	//delete a particular category by ID
	@DeleteMapping("/{Id}")
	public void DeleteById(@PathVariable("Id")int Id)
	{
		categoryService.deleteById(Id);
	}
	
	

}
