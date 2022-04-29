package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main()======");
		return "main";// interceptor => login.jsp 변경된다.
	}
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm()======");
		return "loginForm";// interceptor => login.jsp 변경된다.
	}
}
