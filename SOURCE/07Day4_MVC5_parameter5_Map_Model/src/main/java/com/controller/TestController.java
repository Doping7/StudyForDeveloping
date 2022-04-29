package com.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	//Model 함수의 매개변수로 받기
	//Model.addAttribute(key/value) = request.setAttribute 와 동일.
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa(Model m) {
		m.addAttribute("username", "홍길동");
		return "main";
	}
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String bbb(Map<String, String> map) {
		map.put("username", "홍길동");
		map.put("address", "서울");
		return "main2";
	}
}

