package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.Product;
import com.ing.domain.ProductGroup;
import com.ing.repository.ProductDetailRepository;
import com.ing.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductDetailRepository productDetailRepository;

	public ProductGroup getProductByGroupId(ProductGroup productGroup) {

		productGroup = productDetailRepository.findByGroupId(productGroup.getGroupId());

		return productGroup;

	}

}
