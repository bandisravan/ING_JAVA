package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.ProductGroup;
import com.ing.service.GetGroupDetailsService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("/api")
public class GetGroupDetailsController {

	@Autowired
	GetGroupDetailsService getGroupDetailsService;

	@GetMapping("/getGroup")
	public List<ProductGroup> GetGroupDetailsRepository(ProductGroup group) {
		return getGroupDetailsService.getGroupDetailsService(group);

	}

}
