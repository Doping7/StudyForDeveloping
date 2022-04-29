package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public DeptDAO getDao() {
		return dao;
	}

	public DeptService(DeptDAO dao) {
	super();
	this.dao = dao;
}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "DeptService [dao=" + dao + "]";
	}
	public List<String> getList(){
		return dao.getList();
	}
	
}
