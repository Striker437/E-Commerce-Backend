package com.Ecommerce.Controller;



import java.io.InputStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Product;
import com.Ecommerce.Service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
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
	
	@GetMapping("/getproductsbycategory/{category_id}")
	public List<Product> getProductsByCategory(@PathVariable("category_id") int category_id)
	{
		
		List<Product>productListbyCategory=productService.getProductsByCategory(category_id);
		
		
		
		return productListbyCategory;
		
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		System.out.println("Adding a product");
		return;
	}
	
	@DeleteMapping("{id}")
	public void DeleteProduct(@PathVariable("id") int Id)
	{
		productService.DeleteById(Id);
		System.out.println("Delete a product");
	}
	
	
	@GetMapping("{id}")
	public Product getAProduct(@PathVariable("id")int Id)
	{
		Product product=productService.getProductDetail(Id);
		return product;
	}

	
	//uploading image
	/*
	 * @GetMapping( value = "/getimage/{img_name}",produces =
	 * MediaType.IMAGE_JPEG_VALUE) public @ResponseBody byte[]
	 * getImageWithMediaType(@PathVariable("img_name") String img_name) throws
	 * IOException {
	 * 
	 * InputStream in = getClass().getResourceAsStream("/images/"+img_name);
	 * System.out.println("image upload-------"+in.toString());
	 * //System.out.println(IOUtils.toByteArray(in).toString()); return
	 * IOUtils.toByteArray(in); }
	 */
	
	/*
	 * @PostMapping("/getproductbyCategory") public List<Product>
	 * getProductByCategory(@RequestBody) {
	 * 
	 * }
	 */
 	
	
	
	
	
	
	
	
	

}
