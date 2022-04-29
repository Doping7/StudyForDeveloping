package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println(dto);
		return "login1"; // key 값은 bean 할떄 처럼 자동으로 첫글자가 소문자인 클래스 이름으로 지정, + 이렇게 하면 자동으로 fowarding이 된다.
		//but 권장하지 않는 방법
	}
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("login",dto);
		mav.setViewName("login2");
		return mav; 
	}
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) {
		System.out.println(dto);
		//request.setAttribute("xxx",dto)랑 같은 의미가 된다.
		return "login3"; // key 값은 bean 할떄 처럼 자동으로 첫글자가 소문자인 클래스 이름으로 지정, + 이렇게 하면 자동으로 fowarding이 된다.
		//but 권장하지 않는 방법
	}
	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(LoginDTO dto, Model m) {
		System.out.println(dto);
		m.addAttribute("login",dto);
		return "login4"; 
	}
}
