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
			nextPage = "main";
		} else {
			nextPage = "loginForm";
			m.addAttribute("mesg", "아이디, 비밀번호를 확인해주세요.");
		}
		return nextPage;
	}
}