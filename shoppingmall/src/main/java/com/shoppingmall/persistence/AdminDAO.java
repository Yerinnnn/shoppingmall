package com.shoppingmall.persistence;

import java.util.List;

import com.shoppingmall.domain.CategoryVO;

public interface AdminDAO {
	// 카테고리
	public List<CategoryVO> category() throws Exception;
}
