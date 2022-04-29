package com.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	GoodsService service;
	
@RequestMapping("/goodsList")
	public ModelAndView goodsList(String gCategory) {
		System.out.println(gCategory);
		ModelAndView mav = new ModelAndView();
		System.out.println(service);
		if(gCategory == null) {
			gCategory = "top";
		}
		List <GoodsDTO> list = service.goodsList(gCategory);
		System.out.println(list);
		mav.addObject("goodsList", list);// request.setAttr랑 동일.
		mav.setViewName("main");
		return mav;
	}
	@RequestMapping("/goodsRetrieve")
	@ModelAttribute("goodsretrieve")
	public GoodsDTO goodsRetrieve(String gCode, HttpSession session) {
		if(gCode == null) {
			gCode = (String)session.getAttribute("mesg");
		}
		System.out.println(gCode);
		GoodsDTO dto = service.goodsRetrieve(gCode);
		System.out.println(dto);
		return dto;
	}
	@RequestMapping("/loginCheck/cartAdd")
	public String cartAdd(CartDTO dto, HttpSession session) {
		System.out.println(dto);
		MemberDTO mdto = (MemberDTO)session.getAttribute("login");
		dto.setUserid(mdto.getUserid());
		session.setAttribute("mesg", dto.getgCode());
		System.out.println(dto);
		int n = service.cartAdd(dto);
		System.out.println(n);
		return "redirect:../goodsRetrieve";
	}
	@RequestMapping("/loginCheck/CartList")
	public String CartList(RedirectAttributes m, HttpSession session) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserid();
		System.out.println(userid);
		List<CartDTO>list = service.cartlist(userid);
		System.out.println(list);
		m.addFlashAttribute("cartlist",list);
		return "redirect:../cartList" ;
		//아래는 내가 한거
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("cartlist", list);
//		mav.setViewName("redirect:../cartList");
//		return mav;
	}
	@RequestMapping("/loginCheck/cartUpdate")
	@ResponseBody
	public void cartUpdate(@RequestParam HashMap <String, String> map) {
		System.out.println(map);
		service.cartUpdate(map);
	}
}
