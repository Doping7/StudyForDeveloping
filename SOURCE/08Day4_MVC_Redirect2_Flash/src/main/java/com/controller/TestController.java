package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main()======");
		return "main";
	}
	//redirect-flash<Mvc:annotation-driven/> 필요함
	@RequestMapping(value = "/flash", method = RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {
		System.out.println("redirectFlash()======");
		m.addFlashAttribute("userid", "홍길동");//redirectArribute 사용하기 위함
		//request.setAttr 랑 동일
		return "redirect:main";

	}
}
