package com.service;

import org.springframework.stereotype.Component;

//@Component  // 따로 id 지정을 하지 않는다면 자동으로 첫글자가 소문자인 클래스명으로 id를 지정해준다. "deptService"
@Component("test")
public class DeptService {

	public String getService() {
		return "DeptService.getService()호출됨";
	}
}
