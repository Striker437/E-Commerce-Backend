package com.Ecommerce.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Product;
import com.Ecommerce.Repository.ProductRepository;
import com.Ecommerce.Service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		
		List<Product> productList=productService.getAllProducts();
		System.out.println("Productlist");
		return ResponseEntity.ok(productList);
		
		
	}
	
	@GetMapping("/getproductsbycategory/{category_id}")
	public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable("category_id") int category_id)
	{
		
		List<Product>productListbyCategory=productService.getProductsByCategory(category_id);
		
		
		
		return ResponseEntity.ok(productListbyCategory);
		
	}
	
	
	
	//for searching products by name 
	@GetMapping("/search/{keyword}")                  
	public ResponseEntity<List<Product>> getProductsByContainingName(@PathVariable("keyword") String keyword)
	{
		List<Product>productListByName=productService.getProductsByContainingName(keyword);
		return ResponseEntity.ok(productListByName);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product createdProduct = productService.saveProduct(product);
		System.out.println("Adding a product");
		return ResponseEntity.ok(createdProduct);
	}
	
	@DeleteMapping("{id}")
	public List<Product> DeleteProduct(@PathVariable("id") int Id)
	{
		return productService.DeleteById(Id);
		
		
		
	}
	
	@DeleteMapping("/categorywise/{id}")
	public List<Product> DeleteProductCategory(@PathVariable("id") int Id)
	{
		List<Product> listproductCategory=productService.DeleteProductCategory(Id);
		return listproductCategory;
		
		
		
		
		
		
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
