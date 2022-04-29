package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

	@RequestMapping("/kkk2")
	public String xxx() {
		System.out.println("SecondController");
		return "/WEB-INF/views/hello.jsp";
	}
}
