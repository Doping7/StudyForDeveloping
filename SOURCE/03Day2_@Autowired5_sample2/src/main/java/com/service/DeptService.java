package com.service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.DeptDAO;

public class DeptService {
@Resource
	DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getList() {
		return dao.getList();
	}
}
