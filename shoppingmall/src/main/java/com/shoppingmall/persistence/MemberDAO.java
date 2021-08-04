package com.shoppingmall.persistence;

import com.shoppingmall.domain.MemberVO;

public interface MemberDAO {
	
	public void signup(MemberVO vo) throws Exception;
	
	public MemberVO signin(MemberVO vo) throws Exception;
}
