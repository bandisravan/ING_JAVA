package com.ing.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("/api")
public class DemoController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String createAccount() {
		

		return "Success";
	}
	
}
