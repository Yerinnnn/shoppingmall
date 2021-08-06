package com.shoppingmall.persistence;

import java.util.List;

import com.shoppingmall.domain.CategoryVO;
import com.shoppingmall.domain.GoodsVO;
import com.shoppingmall.domain.GoodsViewVO;

public interface AdminDAO {
	// 카테고리
	public List<CategoryVO> category() throws Exception;
	
	// 상품 등록 
	public void register(GoodsVO vo) throws Exception;

    // 상품 목록 
	public List<GoodsVO> goodsList() throws Exception;
	
	// 상품 조회 + 카테고리 조회 
	public GoodsViewVO goodsView(int gdsNum) throws Exception; 
	
	// 상품 수정
	public void goodsModify(GoodsVO vo) throws Exception;
	
	// 상품 삭제 
	public void goodsDelete(int gdsNum) throws Exception;
}
