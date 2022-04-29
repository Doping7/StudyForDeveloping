package com.dao;

import org.springframework.stereotype.Repository;

import com.entry.DeptDTO;
@Repository
public class DeptDAO {

	public DeptDTO getInfo() {
		return new DeptDTO(100, "영업", "서울");
	}
	
}
