package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ing.domain.Product;
import com.ing.domain.ProductGroup;
import com.ing.service.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/")
public class ProductController {
	
	@Autowired
	ProductService productService;

	
	@RequestMapping(value = "/products", method = RequestMethod.POST, consumes = "application/json")
	public ProductGroup getProduct(@RequestBody ProductGroup productgroup) {
		
		ProductGroup product=productService.getProductByGroupId(productgroup);
		//product.setProductName(null);
		return product;

	}
	
	
}
