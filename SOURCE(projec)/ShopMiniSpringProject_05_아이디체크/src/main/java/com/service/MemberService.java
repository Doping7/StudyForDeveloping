package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;
@Service
public class MemberService {
	@Autowired
	MemberDAO dao;

	
	public void memberAdd(MemberDTO dto) {
		dao.memberAdd(dto);
		
	}


	public MemberDTO mypage(String userid) {
		MemberDTO dto = dao.mypage(userid);
		return dto;
	}


	public int idCheck(String userid) {
		int n = dao.idCheck(userid);
		return n;
	}
}
