package com.shoppingmall.service;

import java.util.List;

import com.shoppingmall.domain.CategoryVO;

public interface AdminService {
	// 카테고리
	public List<CategoryVO> category() throws Exception;
}
