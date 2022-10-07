package com.conntroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
@RequestMapping("product")
@CrossOrigin()			// it help to enable to access the resources 
public class ProductController {

	@GetMapping(value = "allProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(1, "TV", 850000, "https://cdn1.smartprix.com/rx-iSUL96nlp-w1200-h1200/SUL96nlp.jpg"));
		listOfProduct.add(new Product(2, "Computer", 350000, "https://image.shutterstock.com/image-photo/modern-desktop-computer-wireless-keyboard-260nw-55573504.jpg"));
		listOfProduct.add(new Product(3, "Laptop", 970000, "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRrgpCYffiSTw3gl3XFtgC_ZLXN5eG0J-WFWDXk58Eyobs-NY6eY0p7gEh9URgogg_MxGc0VZjQ6Ltfi6aSayw5clWdGwlLhVlK_2NZfS_9WMMbzPBZ2_7b4LxqVAj0v8uHfXXFN2-g&usqp=CAc"));
		listOfProduct.add(new Product(4, "PenDrive",1200, "https://cdn.pixabay.com/photo/2015/07/20/19/50/usb-853230__340.png"));
		return listOfProduct;
	}
	
}
