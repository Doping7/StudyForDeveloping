package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	DeptDAO dao;

	public DeptService(DeptDAO dao) {
		super();
		System.out.println("생성자 출력");
		this.dao = dao;
	}
	
	public List<String> getList(){
		return dao.getList();
	}
	
}
