package com.cocoa.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Select;

import com.cocoa.model.PmsProduct;

public interface PmsProductMapper {
	int insert(PmsProduct record);
	
	 @Select("SELECT * FROM test")
	 HashMap<String, Object> test(int name);
}