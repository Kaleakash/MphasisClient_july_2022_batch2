package com.onlineshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.bean.Product;
import com.onlineshop.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Product details stored";
	}
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public String findProductById(int pid) {
		Optional<Product> result  = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			return p.toString();
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findProductByPrice(float price){
		return productRepository.findProductByPrice(price);
	}
	
	public String deleteProduct(int pid) {
		Optional<Product> result  = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			productRepository.delete(p);
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String updateProduct(Product product) {
		Optional<Product> result  = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
			p.setPrice(product.getPrice());
			p.setUrl(product.getUrl());
			productRepository.saveAndFlush(p);
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
}
