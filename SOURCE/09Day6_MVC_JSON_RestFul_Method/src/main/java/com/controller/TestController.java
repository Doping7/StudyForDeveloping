package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@RestController // 모든 주소처리 응답이 @ResponseBody로 자동처리된다.
public class TestController {

	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String get() {
		System.out.println("get======");
		return "main";
	}

	@RequestMapping(value = "/board", method = RequestMethod.POST)
	public String post() {
		System.out.println("post======");
		return "main";
	}
	@RequestMapping(value = "/board", method = RequestMethod.PUT)
	public String put() {
		System.out.println("put======");
		return "main";
	}
	@RequestMapping(value = "/board", method = RequestMethod.DELETE)
	public String delete() {
		System.out.println("delete======");
		return "main";
	}
}

