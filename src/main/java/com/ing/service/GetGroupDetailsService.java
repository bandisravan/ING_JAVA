package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.ProductGroup;
import com.ing.repository.GetGroupDetailsRepository;

@Service
public class GetGroupDetailsService {
	@Autowired
	GetGroupDetailsRepository groupDetailsRepository;

	public List<ProductGroup> getGroupDetailsService(ProductGroup group) {
		List<ProductGroup> productgroup = groupDetailsRepository.findAll();

		ProductGroup groupname = new ProductGroup();
		groupname.setGroupName(group.getGroupName());
		productgroup.add(groupname);

		return productgroup;

	}

}
