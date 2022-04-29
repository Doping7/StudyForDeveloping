package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GoodsDAO_Interface;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

@Service
public class GoodsService {

	@Autowired
	GoodsDAO_Interface dao; // 여기에는 어떤 DAO를 갈지 모르기 때문에 모든 DAO의 부모가 되는 Interface를 객체 생성해주면 된다.

	public List<GoodsDTO> goodsList(String gCategory) throws Exception{
		System.out.println(dao);
		List <GoodsDTO> list = dao.goodsList(gCategory);
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) throws Exception{
		GoodsDTO dto = dao.goodsRetrieve(gCode);
		return dto;
	}

	public int cartAdd(CartDTO dto)throws Exception {
		int n = dao.cartAdd(dto);
		return n;
	}

	public List<CartDTO> cartlist(String userid) throws Exception{
		List<CartDTO>list = dao.cartlist(userid);
		return list;
	}

	public void cartUpdate(HashMap<String, String> map) throws Exception{
		dao.cartUpdate(map);
		
	}

	public void cartDel(String num)throws Exception {
		dao.cartDel(num);
		
	}

	public void cartAllDel(ArrayList<String> list) throws Exception{
		dao.cartAllDel(list);
		
	}

	public CartDTO cartByNum(String num) throws Exception{
		CartDTO dto = dao.cartByNum(num);
		return dto;
	}

	@Transactional
	public void orderdone(OrderDTO dto, String orderNum) throws Exception{
		dao.orderdone(dto);
		dao.cartDel(orderNum);// 카트에서 해당 처리를 tx처리함. 때문에 root_context.xml에 tx 등록해줘야함.
		
	}
}
