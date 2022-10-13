package com.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshop.bean.Product;
import com.onlineshop.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	@PatchMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@GetMapping(value="findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}
	
	@GetMapping(value="findProductByPrice/{price}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findProductByPrice(@PathVariable("price") float price) {
		return productService.findProductByPrice(price);
	}
	
	@GetMapping(value="findAllProduct/{pid}")
	public String findProductById(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
	
	@DeleteMapping(value="deleteProduct/{pid}")
	public String deleteProductUsingId(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
}
