package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main()======");
		return "main";
	}
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest request) {
		System.out.println("main()======"); //url에 파라미터로 전송. 주의!!! 그래서 출력하려면 getParameter 쓴다.
		 m.addAttribute("userid", "홍길동");  //request는 main으로 넘어가지 않음
		request.setAttribute("passwd","1234");
		return "redirect:main"; //redirect:main?userid=홍길동 으로도 넘기기 가능
	}
	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public String forward(Model m, HttpServletRequest request) {
		System.out.println("main()======"); //url에 파라미터로 전송. 주의!!! 그래서 출력하려면 getParameter 쓴다.
		 m.addAttribute("userid", "홍길동");  //request는 main으로 넘어가지 않음
		request.setAttribute("passwd","1234");
		return "forward:main";
	}
}
