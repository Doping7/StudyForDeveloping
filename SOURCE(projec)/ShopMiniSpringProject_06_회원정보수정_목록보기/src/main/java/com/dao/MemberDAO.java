package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate session;

	public void memberAdd(MemberDTO dto) {
		int n = session.insert("MemberMapper.memberAdd", dto);
		System.out.println(n);
	}

	public MemberDTO mypage(String userid) {
		MemberDTO dto = session.selectOne("MemberMapper.mypage",userid);
		return dto;
	}

	public int idCheck(String userid) {
		int n = session.selectOne("MemberMapper.idCheck", userid);
		return n;
	}

	public int memberUpdate(MemberDTO dto) {
		int n = session.update("MemberMapper.memberUpdate", dto);
		return n;
	}
}
