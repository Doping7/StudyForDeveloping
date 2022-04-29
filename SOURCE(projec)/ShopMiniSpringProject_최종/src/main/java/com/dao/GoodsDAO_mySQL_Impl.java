package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

//@Repository
public class GoodsDAO_mySQL_Impl implements GoodsDAO_Interface {

	//sqlTemplate 주입이 되는데 mySQL을 사용하게 된다면 root-context에서 다른 데이터 베이스를 등록하는 것을 잊지말자.
	@Override
	public List<GoodsDTO> goodsList(String gCategory) {
		// TODO Auto-generated method stub
		//mysql mapper id를 사용해서 작성하면 된다.
		return null;
	}

	@Override
	public GoodsDTO goodsRetrieve(String gCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cartAdd(CartDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CartDTO> cartlist(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cartUpdate(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartDel(String num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cartAllDel(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartDTO cartByNum(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void orderdone(OrderDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
