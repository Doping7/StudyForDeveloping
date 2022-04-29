package com.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@ModelAttribute("xxx")
	public ArrayList<String> getList(){
		ArrayList<String>list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list;
	};
	@RequestMapping(value = "/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("aaaa");
		return "main2";
	}
	@RequestMapping(value = "/bbb")
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("bbbbs");
		return "main2";
	}
}
