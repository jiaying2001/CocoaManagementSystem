package com.cocoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocoa.mapper.PmsProductMapper;
import com.cocoa.model.PmsProduct;

@Service
public class PmsProductService {
	@Autowired
	PmsProductMapper pmsProductMapper;
	
	public boolean create(PmsProduct pmsProduct) {
		pmsProduct.setId(null); // set null to see if insert operation successfully
		pmsProductMapper.selectiveInsert(pmsProduct); // if succeed, id should not be null
		if(pmsProduct.getId() == null) return false;
		return true;
	}
}
