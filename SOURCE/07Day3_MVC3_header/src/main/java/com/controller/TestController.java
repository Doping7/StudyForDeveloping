package com.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/header")
	public String xxx(HttpServletRequest req) {
	Enumeration<String> keys = req.getHeaderNames();
	while (keys.hasMoreElements()) {
		String key = (String) keys.nextElement();
		String value = req.getHeader(key);
		System.out.println(key + "\t" + value );
	}
	HttpSession session = req.getSession();
	System.out.println(session);
	return "hello";
	}
}
