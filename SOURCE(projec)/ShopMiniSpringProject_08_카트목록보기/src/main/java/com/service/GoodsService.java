package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;

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
}
