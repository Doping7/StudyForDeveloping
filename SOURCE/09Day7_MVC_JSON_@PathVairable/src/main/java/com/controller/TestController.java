package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("test");
		return "main";
	}
	@RequestMapping(value = "/board/name/{xxx}", method = RequestMethod.GET)
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println("aaa" + name);
		return "main";
	}
	@RequestMapping(value = "/board2/name/{xxx}/age/{yyy}", method = RequestMethod.GET)
	public String aaa2(@PathVariable("xxx") String name, @PathVariable("yyy") int age) {
		System.out.println("aaa" + name + age);
		return "main";
	}
}
