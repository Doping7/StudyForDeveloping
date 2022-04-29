package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public  String login() {

		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public  String login(LoginDTO dto, HttpSession session) {
		String nextPage;
		LoginDTO dto1 = (LoginDTO)session.getAttribute("login");
		String userid = dto1.getUserid();
		String passwd = dto1.getPasswd();
		if (dto.getUserid().equals(userid) && dto.getPasswd().equals(passwd)) {
			System.out.println(dto);
			nextPage = "login";
		} else {
			System.out.println("id 불일치");
			nextPage = "loginForm";
	}
	return nextPage;	
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member() {
		return "memberform";
	}
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String member(LoginDTO dto, HttpSession session) {
		session.setAttribute("login", dto);
		return "redirect:login";
	}
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main";
	}
}
