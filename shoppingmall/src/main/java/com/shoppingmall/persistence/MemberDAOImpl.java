package com.shoppingmall.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.shoppingmall.domain.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shoppingmall.mappers.memberMapper";

	@Override
	public void signup(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + "signup", vo);
		
	}

}
