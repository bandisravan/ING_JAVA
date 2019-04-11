package com.ing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	private Long productId;
	private String productName;
	private String productDesc;
	private int productViewCount;

	
	
	
	public int getProductViewCount() {
		return productViewCount;
	}

	public void setProductViewCount(int productViewCount) {
		this.productViewCount = productViewCount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Product() {
		super();
	}

	public Product(Long productId) {
		super();
		this.productId = productId;
	}
}
