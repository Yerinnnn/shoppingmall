package com.shoppingmall.service;

import com.shoppingmall.domain.MemberVO;

public interface MemberService {
	// 회원가입
	public void signup(MemberVO vo) throws Exception;
}
