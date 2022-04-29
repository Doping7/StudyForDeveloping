package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		DeptService service = (DeptService)ctx.getBean("deptService");
		System.out.println(service.getInfo());

	}

}
