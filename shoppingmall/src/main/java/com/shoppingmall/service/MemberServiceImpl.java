package com.shoppingmall.service;

import javax.inject.Inject;

import com.shoppingmall.domain.MemberVO;
import com.shoppingmall.persistence.MemberDAO;

public class MemberServiceImpl implements MemberService {
	@Inject
	private MemberDAO dao;

	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.signup(vo);
	}

}
