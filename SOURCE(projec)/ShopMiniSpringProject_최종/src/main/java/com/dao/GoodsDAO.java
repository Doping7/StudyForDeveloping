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
public class GoodsDAO implements GoodsDAO_Interface {
	@Autowired
	SqlSessionTemplate session; // oracleDB에 접속

	@Override
	public List<GoodsDTO> goodsList(String gCategory) throws Exception{
		System.out.println(session);
		List<GoodsDTO>list = session.selectList("GoodsMapper.goodsList", gCategory);
		return list;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) throws Exception {
		GoodsDTO dto = session.selectOne("GoodsMapper.goodsRetrieve", gCode);
		return dto;
	}

	@Override
	public int cartAdd(CartDTO dto) throws Exception{
		int n = session.insert("CartMapper.cartAdd", dto);
		return n;
	}

	@Override
	public List<CartDTO> cartlist(String userid) throws Exception{
		List<CartDTO>list = session.selectList("CartMapper.cartList", userid);
		return list;
	}

	@Override
	public void cartUpdate(HashMap<String, String> map) throws Exception{
		int n = session.update("CartMapper.cartUpdate", map);
		System.out.println(n);
	}

	@Override
	public void cartDel(String num) throws Exception{
		int n = session.delete("CartMapper.cartDel", Integer.parseInt(num));
		System.out.println(n);
		
		
	}

	@Override
	public void cartAllDel(ArrayList<String> list) throws Exception{
		int n = session.delete("CartMapper.cartAllDel", list);
		System.out.println(n);
		
	}

	@Override
	public CartDTO cartByNum(String num) throws Exception{
		CartDTO dto = session.selectOne("CartMapper.cartbyNum", num);
		return dto;
		
	}

	@Override
	public void orderdone(OrderDTO dto) throws Exception {
		session.insert("CartMapper.orderDone", dto);
		
	}
}
