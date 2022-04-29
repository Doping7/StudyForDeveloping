package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	//1. 리턴타입 String = 뷰만 알려줌
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()함수 실행됨==========");
		return "main";
	}
	//1-2. redirect: 매핑주소로 새로운 요청, 매핑주소의 return 페이지가 응답페이지가 됨.
	@RequestMapping(value = "/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("/hhh=======");
		request.setAttribute("test", "홍길동");
		return "redirect:aaa";//종요! redirect 시 request.setATT 전달이 안된다. redirect 하면서 새로운 request가 날아가기 때문
	}
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb============");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2");
		return mav;
	}
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)// view 페이지를 안정하면 자동으로 url이름과 같은 jsp를 찾는다
	public LoginDTO xxx() {
		System.out.println("/ccccc");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx")
	public LoginDTO xxx2() {
		System.out.println("/dddd");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> eee() {
		System.out.println("/eee");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동01");
		list.add("홍길동02");
		list.add("홍길동03");
		return list;
	}
	@RequestMapping(value = "/fff", method = RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		System.out.println("/fff=======");
		request.setAttribute("username", "홍길동");
	}
	@RequestMapping(value = "/ggg", method = RequestMethod.GET)
	public void ggg(Model m) {
		System.out.println("/fff=======");
		m.addAttribute("username", "홍길동");
	}
}
