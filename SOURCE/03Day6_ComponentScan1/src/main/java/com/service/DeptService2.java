package com.service;

import org.springframework.stereotype.Component;

@Component("xxx")  // id를 지정할때는 이런 방식으로 하면 된다.
public class DeptService2 {

	public String getService() {
		return "DeptService.getService()호출됨";
	}
}
