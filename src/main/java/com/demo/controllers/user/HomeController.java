package com.demo.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.models.Product;
import com.demo.services.ProductService;

@Controller
@RequestMapping(value = "home")
public class HomeController {
    
//	private ProductService productService;
	
	@RequestMapping(value ="index",method = RequestMethod.GET)
	public String index() {
//	public String index(ModelMap modelmap) {
		System.out.println("123"+1);
//		Product product = new Product();
//		modelmap.put("featuredProducts", productService.featuredProducts(true,true,6));
//		modelmap.put("latestProducts", productService.latestProducts(true, 6));
		return "home.index";
	}
}
