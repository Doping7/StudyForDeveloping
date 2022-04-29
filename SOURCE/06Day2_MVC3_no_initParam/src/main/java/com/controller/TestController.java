package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa호출");
		return "/WEB-INF/views/home.jsp";
	}
}
