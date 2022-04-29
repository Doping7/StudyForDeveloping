package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	//main : interceptor를 통해 session 로그인 정보 있으면 main.jsp
		//로그인 정보가 없는 경우 loginForm.jsp
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
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login (String userid , String passwd, HttpSession session) {
		System.out.println("TestController.login()======");
		session.setAttribute("login", userid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd",passwd);
		mav.setViewName("logined");
		return mav;
	}
}
