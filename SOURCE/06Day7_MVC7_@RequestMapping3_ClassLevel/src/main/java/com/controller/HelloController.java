package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	//http://localhost:8090/app1/hello/login
	@RequestMapping(value = "/login")
	public String x() {
		System.out.println("HelloController.x()==========");
		return "login";
	}

}
