package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto) {
		System.out.println(dto);
		return "login";
	}
	@RequestMapping(value = "login2", method = RequestMethod.POST)
	public String login2(LoginDTO dto, HttpSession session) {
		session.setAttribute("login", dto);
		return "login";
	}
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
