package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//servlet-context.xml에서 에러처리
	@RequestMapping(value = "/aaa")
	public String xxx() {
		if(true) throw new ArithmeticException("ArithmeticException 발생");
		return "main";
	}
	@RequestMapping("/bbb")
	public String bbb() {
		if (true) throw new NullPointerException("NullPointerException 발생");
		return "main";
	}
	//@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
//	@ExceptionHandler({Exception.class})
//	public String errorPage() {
//		return "error";
//	}
}
