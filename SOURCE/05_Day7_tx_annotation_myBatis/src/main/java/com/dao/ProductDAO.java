package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;



import com.dto.OrderDTO;
import com.dto.ProductDTO;

public class ProductDAO {

	SqlSessionTemplate session;



	public SqlSessionTemplate getSession() {
		return session;
	}
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public List<ProductDTO> selectProduct() {
		return session.selectList("productList");		

	}
	public List<OrderDTO> selectOrder() {
	 return session.selectList("orderList");
	}

	public void addOrder(String pcode, int quantity) {
		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		dto.setQuantity(quantity);
		int n = session.insert("order.orderInsert", dto);
		System.out.println("order table insert = " +n);
		session.update("product.produ		", dto);
	}
	
	
}
