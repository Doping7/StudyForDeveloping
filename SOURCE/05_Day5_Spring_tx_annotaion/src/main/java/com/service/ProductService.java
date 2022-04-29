package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {

	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	


	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	}
	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}
	@Transactional // annotation을 통해 트랜젝션 처리
	public void addOrder(String pcode, int quantity) throws Exception{
		dao.addOrder(pcode, quantity);
		
	}
}
