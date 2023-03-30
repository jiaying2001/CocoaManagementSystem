package com.cocoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cocoa.common.api.CommonResult;
import com.cocoa.model.PmsProduct;
import com.cocoa.service.PmsProductService;

@Controller
@RequestMapping("/product")
public class PmsProductController {
	@Autowired
	PmsProductService pmsProductService;
	
	@PostMapping("/create")
	@ResponseBody
	public CommonResult cerate(@RequestBody PmsProduct pmsProduct) {
		pmsProduct.setName("test");
		pmsProduct.setProductSn("test");
		boolean success = pmsProductService.create(pmsProduct);
		return success? CommonResult.success("succeed"): CommonResult.failed();
	}
}
