package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@RequestMapping("/login") //get방식은 기본으로 사용되는 방식이다. 때문에 반드시 명시하지 않아도 괜찮다.
	public String loginForm() {
		System.out.println("loginForm호출");
		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("login호출");
		return "login";
	}
}
