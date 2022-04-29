package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main() {
		return "hello";
	}
	@RequestMapping("/setCookie")
	public String setCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie c1 = new Cookie("myName", "홍길동");
		Cookie c2 = new Cookie("age", "10");
		Cookie c3 = new Cookie("favorite", "악기");
		c1.setMaxAge(60*60);
		c2.setMaxAge(60*60);
		c3.setMaxAge(60*60);
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		System.out.println("set cookies");
		return "hello";
	}
	@RequestMapping("/getCookie")
	public String getCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie [] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName()+"\t"+cookie.getValue());
		}
		return "hello";
	}
}
