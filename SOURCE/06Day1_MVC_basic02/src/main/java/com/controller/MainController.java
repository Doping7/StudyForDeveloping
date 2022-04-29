package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa호출");
		return "home"; //home.jsp
	}
	@RequestMapping("/aaa2")
	public String aaa2() {
		System.out.println("aaa2호출");
		return "test"; //home.jsp
	}
}
