package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entry.DeptDTO;

@Service
public class DeptService {

	@Autowired
	DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	public DeptDTO getInfo() {
		return dao.getInfo();
	}

	@Override
	public String toString() {
		return "DeptService [dao=" + dao + "]";
	}
	
}
