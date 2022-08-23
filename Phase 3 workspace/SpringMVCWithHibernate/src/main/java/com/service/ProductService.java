package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(productDao.storeProductDetails(product)>0){
			return "Product details stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public String deletetProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String searchProductById(int pid) {
		Product p = productDao.searchProductById(pid);
		if(p==null) {
			return "Record not present";
		}else {
			return p.toString();
		}
	}
	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
	
}
