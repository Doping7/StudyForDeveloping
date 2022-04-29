package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout (HttpSession session) {
		session.invalidate();
		//return "loginForm";
		return "redirect:login";// redirect는 /login 주소를 요청하는것이다. jsp를 의미하는게 아님
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login () {
		return "loginForm";
	}
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login (LoginDTO dto) {
//		System.out.println(dto);
//		return "login";
//	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2 (LoginDTO dto, HttpSession session) {
		System.out.println(dto);
		session.setAttribute("login", dto);
		return "login";
	}
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login3 (LoginDTO dto, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(dto);
		request.setAttribute("login", dto);
		return "login";
	}
	
}

