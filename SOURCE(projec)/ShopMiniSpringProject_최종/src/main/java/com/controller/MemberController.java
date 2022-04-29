package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error"; //error/error.jsp
	}
	
	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO dto, Model m) throws Exception{
		service.memberAdd(dto);
		m.addAttribute("success","회원가입성공");
		return "main"; //main.jsp
	}
	@RequestMapping(value = "/loginCheck/myPage")
	public String myPage(HttpSession session) throws Exception{
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
	@RequestMapping(value = "idDuplicateCheck", produces = "text/plain;charset=UTF-8")//produce = responseBody로 넘어갈때 한글깨지는 현상 방지
	@ResponseBody
	public String idDuplicateCheck(@RequestParam("id") String userid) throws Exception{// mypage 활용해 DTO로 검사하는 방법도 있음
		System.out.println(userid);
		int n = service.idCheck(userid);
		if (n==1) {
			return "success";
		}else {
			return "error";
		}
		
	}
	@RequestMapping("/loginCheck/memberUpdate")
	public String memberUpdate(MemberDTO dto, HttpSession session) throws Exception{
		System.out.println(dto);
		int n = service.memberUpdate(dto);
		System.out.println(n);
		if (n == 1) {
			String userid = dto.getUserid();
			dto = service.mypage(userid);
			String mesg = "수정완료";
			session.setAttribute("mesg", mesg);
			session.setAttribute("login", dto);
		}
		return "redirect:../loginCheck/myPage";
		//return "redirect:../myPage"; //둘다 사용해도 문제 없다.
		
	}
}
