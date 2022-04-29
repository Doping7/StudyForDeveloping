package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {
	@Autowired
	SqlSessionTemplate session;

	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public List<DeptDTO> select() {
		return session.selectList("selectAll");
	}

	public int add(DeptDTO xx) {
		return session.insert("insert", xx);
	}

	public int delete(int i) {
		return session.delete("delete", i);
	}

	public int update(DeptDTO deptDTO) {
		return session.update("update",deptDTO);
	}
	
	
}
