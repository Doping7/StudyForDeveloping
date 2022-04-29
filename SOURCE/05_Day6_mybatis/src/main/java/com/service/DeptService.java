package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {
	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public List<DeptDTO> select() {
		return dao.select();
	}

	public int add(DeptDTO xx) {
		return dao.add(xx);
	}

	public int delete(int i) {
		return dao.delete(i);
	}

	public int update(DeptDTO deptDTO) {
		return dao.update(deptDTO);
	}
	
	
}
