package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

public interface GoodsDAO_Interface {

	List<GoodsDTO> goodsList(String gCategory) throws Exception;

	GoodsDTO goodsRetrieve(String gCode)throws Exception;

	int cartAdd(CartDTO dto)throws Exception;

	List<CartDTO> cartlist(String userid)throws Exception;

	void cartUpdate(HashMap<String, String> map)throws Exception;

	void cartDel(String num)throws Exception;

	void cartAllDel(ArrayList<String> list)throws Exception;

	CartDTO cartByNum(String num)throws Exception;

	void orderdone(OrderDTO dto)throws Exception;

}