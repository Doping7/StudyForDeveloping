package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = (EchoBean)ctx.getBean("echoBean");
		System.out.println(echo.sayEcho());
		System.out.println(echo.getAaa());
		
		echo = (EchoBean)ctx.getBean("echoBean2");
		System.out.println(echo.getAaa());

	}

}
