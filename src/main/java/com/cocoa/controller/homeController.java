package com.cocoa.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cocoa.mapper.PmsProductMapper;
import com.cocoa.service.PmsProductService;

@RestController
@RequestMapping("/")
public class homeController {
	
	@Autowired
	PmsProductService pmsProductService;
	
	@GetMapping
	public String home() {
		return "";
	}
}
