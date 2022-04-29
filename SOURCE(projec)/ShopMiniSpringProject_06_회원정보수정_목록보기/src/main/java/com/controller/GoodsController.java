package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.GoodsDTO;
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
}
