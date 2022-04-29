package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Service
public class GoodsService {

	@Autowired
	GoodsDAO dao;

	public List<GoodsDTO> goodsList(String gCategory) {
		System.out.println(dao);
		List <GoodsDTO> list = dao.goodsList(gCategory);
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		GoodsDTO dto = dao.goodsRetrieve(gCode);
		return dto;
	}

	public int cartAdd(CartDTO dto) {
		int n = dao.cartAdd(dto);
		return n;
	}

	public List<CartDTO> cartlist(String userid) {
		List<CartDTO>list = dao.cartlist(userid);
		return list;
	}

	public void cartUpdate(HashMap<String, String> map) {
		dao.cartUpdate(map);
		
	}

	public void cartDel(String num) {
		dao.cartDel(num);
		
	}

	public void cartAllDel(ArrayList<String> list) {
		dao.cartAllDel(list);
		
	}

	public CartDTO cartByNum(String num) {
		CartDTO dto = dao.cartByNum(num);
		return dto;
	}

	@Transactional
	public void orderdone(OrderDTO dto, String orderNum) {
		dao.orderdone(dto);
		dao.cartDel(orderNum);// 카트에서 해당 처리를 tx처리함. 때문에 root_context.xml에 tx 등록해줘야함.
		
	}
}
