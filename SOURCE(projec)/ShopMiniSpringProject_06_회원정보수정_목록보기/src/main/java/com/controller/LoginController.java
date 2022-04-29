package com.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;

	@RequestMapping("/login")
	public String login(@RequestParam HashMap<String, String> map, Model m, HttpSession session) {
		System.out.println(map);
		MemberDTO dto = service.login(map);
		String nextPage;
		if (dto != null) {
			System.out.println(dto);
			m.addAttribute("loginsuccess", "로그인 성공");
			session.setAttribute("login", dto);
			nextPage = "redirect:/goodsList?gCategory=top";
		} else {
			nextPage = "loginForm";
			m.addAttribute("mesg", "아이디, 비밀번호를 확인해주세요.");
		}
		return nextPage;
	}
	@RequestMapping(value = "/loginCheck/logout")// 두단계 주소를 사용하면 해당 주소가 남아있어서 주소가 꼬임, 그래서 다음페이지 열때 404가 뜬다.
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../";// 그래서 ../를 활용해 상위 주소로 redirect시키는 방법으로 해당 문제를 해소 //회원전용페이지는 servlet-context.xml에 주소등록 후 이용
		//return "../";이거도 안된다. 꼭 redirect사용해주기!
		//return "main";
	}
}