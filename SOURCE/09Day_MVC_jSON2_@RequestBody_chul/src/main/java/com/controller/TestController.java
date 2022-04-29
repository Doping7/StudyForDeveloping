package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Login;

@Controller
public class TestController {
	@RequestMapping("/aaa")
	public String aaa(@RequestBody Login login) {// 비동기 POST방식으로 데이터가 전송되어 올때 @RequestBody 사용
		System.out.println(login);
		return "hello";
	}
//	@RequestMapping("/bbb")
//	public String bbb(@RequestBody Login [] login) {// 비동기 POST방식으로 데이터가 전송되어 올때 @RequestBody 사용
//		for (Login log : login) {
//			System.out.println(log);
//		}
//		return "hello";
//	}
	@RequestMapping("/bbb")// 이거처럼 넘어오면서 바로 list에 넣어주는 것도 해준다. 짱 편리함.
	public String bbb(@RequestBody ArrayList<Login>list) {// 비동기 POST방식으로 데이터가 전송되어 올때 @RequestBody 사용
		System.out.println(list);
		return "hello";
	}
//	@RequestMapping("/ccc")
//	public String ccc(String userid, String passwd) {
//		System.out.println(userid + "\t" + passwd);
//		return "hello";
//	}
//	@RequestMapping("/ccc")
//	public String ccc(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd) {
//		System.out.println(userid + "\t" + passwd);
//		return "hello";
//	}
	@RequestMapping("/ccc")
	public String ccc(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid +"\t" + passwd);
		return "hello";
	}
	@RequestMapping("/ddd")
	public String ddd(String userid) {
		System.out.println(userid);
		return "hello";
	}
//	@RequestMapping("/ddd")// ccc와 동일한 방법 세개다 사용 가능함
//	//근데 post 방식이니 @RequestBody도 사용가능 하지만 이 경우에는 JSON 객체로 넘어올 수 있도록 설정을 해줘야한다. 안그럼 글자 다깨짐
//	public String ddd(@RequestBody String userid) {
//		System.out.println(userid);
//		return "hello";
//	}
}
