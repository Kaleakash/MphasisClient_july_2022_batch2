package com.service;

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
}
