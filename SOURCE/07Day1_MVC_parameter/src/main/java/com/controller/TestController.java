package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println(dto);
		return "login";
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
		System.out.println("id : " + id + " pw : " + pw);
		return "login";
	}
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.println("id : " + userid + " pw : " + passwd);
		return "login";
	}
	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(String userid, String passwd) {
		System.out.println("id : " + userid + " pw : " + passwd);
		return "login";
	}
	@RequestMapping(value = "/login5", method = RequestMethod.POST)
	public String login5(@RequestParam(required = false, defaultValue = "홍길동")String userid, String passwd) {
		System.out.println("id : " + userid + " pw : " + passwd);
		return "login";
	}
	@RequestMapping(value = "/login6", method = RequestMethod.POST)
	public String login6(@RequestParam Map<String, String> m) {
		System.out.println("m : " + m);
		return "login";
	}
}
