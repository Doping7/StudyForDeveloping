package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO dto, Model m) {
		service.memberAdd(dto);
		m.addAttribute("success","회원가입성공");
		return "main"; //main.jsp
	}
	@RequestMapping(value = "/loginCheck/myPage")
	public String myPage(HttpSession session) {
		System.out.println("myPage======");
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserid();
		dto = service.mypage(userid);
		System.out.println(dto);
		session.setAttribute("login", dto);
		return "redirect:../myPage";
	}
	/*
	 * @RequestMapping("/myPage") public String aaa() { return "myPage"; }
	 */
}
