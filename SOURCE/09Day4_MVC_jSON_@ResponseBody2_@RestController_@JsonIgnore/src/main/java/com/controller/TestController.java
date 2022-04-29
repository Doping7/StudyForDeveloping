package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@RestController // 모든 주소처리 응답이 @ResponseBody로 자동처리된다.
public class TestController {

	@RequestMapping("/aaa")
	public Login aaa() {
		System.out.println("aaa함수 호출======");
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}

	@RequestMapping("/bbb")
	public ArrayList<Login> bbb() {
		System.out.println("bbb함수 호출======");
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));

		return list;
	}
	@RequestMapping("/ccc")
	public HashMap<String, ArrayList<Login>> ccc() {
		System.out.println("ccc함수 호출======");
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1", "10"));
		list2.add(new Login("유관순2", "20"));
		list2.add(new Login("유관순3", "30"));
		map.put("one",list);
		map.put("two",list2);

		return map;
	}
	@RequestMapping("/ddd")
	public String ddd() {
		return "ok";
	}
}
