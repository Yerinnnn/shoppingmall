package com.shoppingmall.persistence;

import com.shoppingmall.domain.MemberVO;

public interface MemberDAO {

	public void signup(MemberVO vo) throws Exception;
}
