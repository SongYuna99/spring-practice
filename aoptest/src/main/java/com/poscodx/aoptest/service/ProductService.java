package com.poscodx.aoptest.service;

import org.springframework.stereotype.Service;

import com.poscodx.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String keyword) throws Exception {
		ProductVo vo = new ProductVo(keyword);

//		if (1 - 1 == 0) {
//			throw new RuntimeException("ProductService.find() Exception");
//		}
		return vo;
	}

}
