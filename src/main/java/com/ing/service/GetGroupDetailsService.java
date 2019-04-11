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
		//List<ProductGroup> productgroup = groupDetailsRepository.findAll();
		List<ProductGroup> list=groupDetailsRepository.findAll();
		//ProductGroup groupname = new ProductGroup();
		ProductGroup group2=new ProductGroup();
		for(int i=0;i<list.size();i++) {
			group2=list.get(i);
			group2.setProductName(null);
		}
		
		//groupname.setGroupName(group.getGroupName());
		//productgroup.remove(3);
		//productgroup.add(groupname);

		return list;

	}

}
