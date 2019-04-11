package com.ing.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.domain.Product;
import com.ing.domain.ProductGroup;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

	

}
