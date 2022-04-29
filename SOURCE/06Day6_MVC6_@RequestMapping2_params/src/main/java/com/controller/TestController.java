package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping("/")
	public String main() {
		System.out.println("TestController.main");
		return "login";
	}

	// http://localhost:8080/test_1/login?aaa=bbb
	@RequestMapping(value = "/login", params = "aaa=bbb")
	public String loginForm() {
		System.out.println("TestController.aaa=bbb");
		return "login";
	}

	// http://localhost:8080/test_1/login?aaa=ccc
	@RequestMapping(value = "/login", params = "aaa=ccc")
	public String login() {
		System.out.println("TestController.aaa=ccc");
		return "login";
	}

	// http://localhost:8080/test_1/login?xxx=아무값
	@RequestMapping(value = "/login", params = "xxx")
	public String login2() {
		System.out.println("TestController.xxx=아무값");
		return "login";
	}

	// http://localhost:8080/test_1/login?kkk=b
	@RequestMapping(value = "/login", method = RequestMethod.GET, params = "kkk=b") // param이 일치하는 경우
	public String x() {
		System.out.println("TestController.x   kkk=b");
		return "login";
	}

	// http://localhost:8080/test_1/login?kkk=c
	@RequestMapping(value = "/login", method = RequestMethod.GET, params = "kkk=c") // param이 일치하는 경우
	public String y() {
		System.out.println("TestController.y   kkk=c");
		return "login";
	}

}
