package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String xxx() {
		System.out.println("xxx()======");
		return "main";
	}
	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()======");
		return "main";
	}
	@RequestMapping(value = {"/aaa2", "/aaa3"}, method = RequestMethod.GET)// 두개 매핑주소 할당
	public String aaa2() {
		System.out.println("aaa2()======");
		return "main";
	}
	@RequestMapping(value = "/bbb*", method = RequestMethod.GET)//bbb 뒤에 다른 문자열이 와도 되는거 앞에 bbb만 제대로 들어가있으면 된다.
	public String aaa3() {
		System.out.println("aaa3()======");
		return "main";
	}
	@RequestMapping(value = "/ccc/*", method = RequestMethod.GET)//ccc/xxx/ddd 이거는 안되고 /한번만
	public String aaa4() {
		System.out.println("aaa4()======");
		return "main";
	}
	@RequestMapping(value = "/ddd/**", method = RequestMethod.GET)//ccc/xxx/ddd **이면 이제 위에서 안되는게 된다.
	public String aaa5() {
		System.out.println("aaa5()======");
		return "main";
	}
	@RequestMapping(value = "/eee/**/aaa", method = RequestMethod.GET)//처음과 끝 두개만 잘 맞춰주면 중간에 뭐가들어가든 상관없는 매핑
	public String aaa6() {
		System.out.println("aaa6()======");
		return "main";
	}
	//http://localhost:8085/app/hhh/tester/xxx/1234 하면 tester랑 1234를 userid, passwd 변수에 저장한다.
	@RequestMapping(value = "/hhh/{userid}/xxx/{passwd}", method = RequestMethod.GET)//url에서 데이터 받아오는거임 그래서 userid, passwd라는 키값으로 저장
	public String aaa7(@PathVariable("userid") String userid, @PathVariable("passwd") String passwd) {
		System.out.println("aaa7()======");
		System.out.println(userid +"\t" + passwd);
		return "main";
	}
}
