package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	public DeptDAO dao;

	public DeptService() {
		super();
		System.out.println("public DeptService() 생성자 호출됩니다");
		this.dao = new DeptDAO();
	}

	
	public List<String> getList(){
		return dao.getList();
	}
}
