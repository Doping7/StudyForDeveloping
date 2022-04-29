package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;
@Repository
public class GoodsDAO {
	@Autowired
	SqlSessionTemplate session;

	public List<GoodsDTO> goodsList(String gCategory) {
		System.out.println(session);
		List<GoodsDTO>list = session.selectList("GoodsMapper.goodsList", gCategory);
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		GoodsDTO dto = session.selectOne("GoodsMapper.goodsRetrieve", gCode);
		return dto;
	}

	public int cartAdd(CartDTO dto) {
		int n = session.insert("CartMapper.cartAdd", dto);
		return n;
	}

	public List<CartDTO> cartlist(String userid) {
		List<CartDTO>list = session.selectList("CartMapper.cartList", userid);
		return list;
	}

	public void cartUpdate(HashMap<String, String> map) {
		int n = session.update("CartMapper.cartUpdate", map);
		System.out.println(n);
	}

	public void cartDel(String num) {
		int n = session.delete("CartMapper.cartDel", Integer.parseInt(num));
		System.out.println(n);
		
		
	}

	public void cartAllDel(ArrayList<String> list) {
		int n = session.delete("CartMapper.cartAllDel", list);
		System.out.println(n);
		
	}

	public CartDTO cartByNum(String num) {
		CartDTO dto = session.selectOne("CartMapper.cartbyNum", num);
		return dto;
		
	}

	public void orderdone(OrderDTO dto) {
		session.insert("CartMapper.orderDone", dto);
		
	}
}
