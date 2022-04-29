package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestEchoBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean xxx = (EchoBean)ctx.getBean("echoBean");
		System.out.println(xxx.getXxx());
	}

}
