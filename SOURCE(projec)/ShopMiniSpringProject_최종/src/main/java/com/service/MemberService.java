package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;
@Service
public class MemberService {
	@Autowired
	MemberDAO dao;

	
	public void memberAdd(MemberDTO dto)throws Exception {
		dao.memberAdd(dto);
		
	}


	public MemberDTO mypage(String userid) throws Exception{
		MemberDTO dto = dao.mypage(userid);
		return dto;
	}


	public int idCheck(String userid)throws Exception {
		int n = dao.idCheck(userid);
		return n;
	}


	public int memberUpdate(MemberDTO dto) throws Exception{
		int n = dao.memberUpdate(dto);
		return n;
	}
}
