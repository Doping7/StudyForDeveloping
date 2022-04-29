package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;
import com.service.DeptService2;

public class DeptTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		DeptService service1 = (DeptService)ctx.getBean("test");
		System.out.println(service1.getService());
		System.out.println(service1);
		
		DeptService2 service2 = (DeptService2)ctx.getBean("xxx");
		System.out.println(service2.getService());
	}

}
