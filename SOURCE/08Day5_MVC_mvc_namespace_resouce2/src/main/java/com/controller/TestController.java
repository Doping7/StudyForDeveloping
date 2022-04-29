package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//servlet-context.xml에서 /main요청 처리함
	
	@RequestMapping("/")
	public String ttt() {
		return "home";
	}
	@RequestMapping("/aaa")
	public String main() {
		return "main";
	}
}
